
public class Main {

	public static void main(String[] args) {
		CustomersList customersList = new CustomersList();
		Thread removeCustomers = new Thread( new RemoveCustomerTask(customersList));
		removeCustomers.start();
		System.out.println("Started thread to remove customers");
		
		Thread monitorListSize = new Thread( new MonitorListSizeTask(customersList));
		monitorListSize.start();
		System.out.println("Starting thread to monitor the list size");
		
		for (int i = 0; i < 5; i++) {
			Thread addCustomers = new Thread(new AddCustomerTask(customersList, i*100));
			addCustomers.start();
			System.out.println("Started thread to add customers");
		}
		
	}
	
}
