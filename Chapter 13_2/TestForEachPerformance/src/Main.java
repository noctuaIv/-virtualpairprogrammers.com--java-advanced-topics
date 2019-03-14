import java.time.Duration;
import java.time.Instant;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;


public class Main {

	public static void main(String[] args) {
		
		//set up list
		List<Double> sampleList = new ArrayList<Double>();
		Random random = new Random();
		for (long l = 0; l < 1000000; l++) {
			Double nextNumber = random.nextDouble();
			sampleList.add(nextNumber);
		}
		
		Instant startLambda = Instant.now();
		sampleList.forEach(d -> System.out.println(d));
		Instant stopLambda= Instant.now();

		Instant startLoop = Instant.now();
		for (Double d : sampleList) {
			System.out.println(d);
		}
		Instant stopLoop= Instant.now();
		
		System.out.println("---");
		Duration lambdaDuration = Duration.between(startLambda, stopLambda);
		Duration loopDuration = Duration.between(startLoop, stopLoop);
		
		System.out.println("Lambda loop took   " + lambdaDuration.toMillis() + " milliseconds.");
		System.out.println("Standard loop took " + lambdaDuration.toMillis() + " milliseconds.");
	}

}
