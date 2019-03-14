import java.util.ArrayList;
import java.util.List;


public class CustomersList {

	private List<Customer> customers = new ArrayList<Customer>();

	public void addToList(Customer customer) {
		synchronized (this) {
			
			while ( customers.size() > 100)
			{
				try {
					wait();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			
			customers.add(customer);
			notifyAll();
		}
	}

	public Customer getFromList() {
		synchronized (this) {
			while (customers.size() ==0) {
				try {
					wait();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			notifyAll();
			return customers.remove(0);			
		}
	}
}

