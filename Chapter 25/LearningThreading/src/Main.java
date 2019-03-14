import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;


public class Main {

	public static void main(String[] args) {
		System.out.println("Starting");
		NumbersTask task = new NumbersTask();
		
		ExecutorService pool = Executors.newFixedThreadPool(2);
		
		Future<Double> result = pool.submit(task);
		
		while (!result.isDone()) {
			System.out.println("still waiting");
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {

			}
		}
		
		try {
			System.out.println(result.get());
		} catch (InterruptedException e) {

		} catch (ExecutionException e) {

		}
		
		System.out.println("Finished");
	}

}
