import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;


public class Main {

	public static void main(String[] args) {
		
			
		List<Customer> customers = new ArrayList<Customer>();
		
		Customer customer1 = new Customer(1,"Simon Brown","10 East Street");
		Customer customer2 = new Customer(1,"Jean White","16 North Road");
		Customer customer3 = new Customer(1,"Alison Green","9 South Gardens");

		customers.add(customer1);
		customers.add(customer2);
		customers.add(customer3);
		
		
		Iterator<Customer> iterator = customers.iterator();
		while (iterator.hasNext()) {
			Customer nextCustomer = iterator.next();
			System.out.println(nextCustomer.getName());
		}
		
		Collections.sort(customers, new CustomerComparator());
		
		for (Customer nextCustomer : customers) {
			System.out.println(nextCustomer.getName());
		}
		
		StringWorker<String,Integer> sw = new StringWorker<String,Integer>("Hello", 123);
		System.out.println(sw.toString());
		StringWorker<String,String> sw2 = new StringWorker<String,String>("Hello", "world");
		System.out.println(sw2.toString());
		
		System.out.println( StringWorker.getString(customer1, "Hello"));
		
	}

}
