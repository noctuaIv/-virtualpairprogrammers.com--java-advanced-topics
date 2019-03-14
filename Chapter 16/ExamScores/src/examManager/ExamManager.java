package examManager;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.ToDoubleFunction;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ExamManager {
		
	private List<Double> myScores;

	public ExamManager() {
		myScores = new ArrayList<Double>();
		myScores.add(78.3);
		myScores.add(69.2);
		myScores.add(44.7);
		myScores.add(61.6);
		myScores.add(80.2);
		myScores.add(66.9);
		myScores.add(54.1);
		myScores.add(-10.5);
	}

	public Double customCalculation(ToDoubleFunction<List<Double>> calculator) {
		return calculator.applyAsDouble(myScores);
	}
	
	public void printScores() {
		
		 Collections.sort(myScores, (arg0, arg1) -> {
			int result = 0;
			if (arg0 < arg1) result = 1;
			if (arg1 < arg0) result = -1;
			return result;
		});
		
		myScores.forEach( s -> System.out.println(s));
	}
	
	public void printSelectedScores(Predicate<Double> testCriteria) {
		myScores.stream().filter(testCriteria).forEach(s -> System.out.println(s));
	}
	
	public void testLambdaExceptions() {
		myScores.forEach( s -> {
			int result = 0/0;
			if (s <=0) {
				throw new NumberFormatException();
			}
			else {
				System.out.println ("Valid Score: " + s);
			}
		});
	}
	
	public void testStandardExceptions() {
		for (Double s : myScores) {
			int result = 0/0;
			if (s <=0) {
				throw new NumberFormatException();
			}
			else {
				System.out.println ("Valid Score: " + s);
			}
		};
	}
	
	public double getTotalOfAllScores() {
		return myScores.stream().reduce(0d, (a,b) -> a+b);
	}
	
	public List<Double> doubleAllScores() {
		return myScores.stream().map(d -> d*2).collect(Collectors.toList());
	}
	
}
