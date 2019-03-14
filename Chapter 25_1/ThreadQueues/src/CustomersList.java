import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;


public class CustomersList {

	private List<Customer> customers = new ArrayList<Customer>();

	private Lock lock = new ReentrantLock();
	private Condition dataAvailable = lock.newCondition();
	private Condition listIsGettingFull = lock.newCondition();


	public void addToList(Customer customer) {
		lock.lock();
		try
		{
			customers.add(customer);
			dataAvailable.signalAll();
			if (customers.size() > 90) {
				listIsGettingFull.signalAll();
			}
		}
		finally {
			lock.unlock();
		}
	}

	public Customer getFromList() {
		lock.lock();
		try
		{
			while (customers.size() ==0) {
				try {
					dataAvailable.await();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			return customers.remove(0);
		}
		finally {
			lock.unlock();
		}
	}

	public int getListSize() {
		lock.lock();	
		try 
		{
			while( customers.size() < 100) {
				try {
					listIsGettingFull.await();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			return customers.size();
		}
		finally {
			lock.unlock();
	}
}
}

