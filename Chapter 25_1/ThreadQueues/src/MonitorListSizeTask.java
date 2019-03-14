
public class MonitorListSizeTask implements Runnable {

	private CustomersList customersList;
	
	public MonitorListSizeTask(CustomersList customersList) {
		this.customersList = customersList;
	}
	
	@Override
	public void run() {
		
		while(true) {
			int result = customersList.getListSize();
			if (result > 100) {
				System.out.println("Warning - the list is getting big!");
			}
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				break;
			}
		}

	}

}
