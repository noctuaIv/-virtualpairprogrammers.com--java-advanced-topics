
public class Main {

	public static void main(String[] args) {
		System.out.println("Starting");
		NumbersTask task = new NumbersTask();
		
		for (int i = 1; i<=5; i++) {
			Thread numbersThread = new Thread(task);
			numbersThread.start();
		}
		System.out.println("Finished");
	}

}
