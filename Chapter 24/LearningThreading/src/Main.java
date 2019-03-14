
public class Main {

	public static void main(String[] args) {
		System.out.println("Starting");
		NumbersTask task = new NumbersTask();
		
		Thread numbersThread1 = new Thread(task);
		numbersThread1.start();
		
		Thread numbersThread2 = new Thread(task);
		numbersThread2.start();
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		//numbersThread1.interrupt();
		//numbersThread2.interrupt();
		
		try {
			numbersThread1.join();
			numbersThread2.join();
		} catch (InterruptedException e) {
			
		}
		
		
		
		System.out.println("Finished");
	}

}
