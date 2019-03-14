import java.util.ArrayList;
import java.util.List;


public class TestInheritance {

	public static void main(String[] args) {
		List<Number> myNumbers = new ArrayList<Number>();
		myNumbers.add(16);
		myNumbers.add(107L);
		myNumbers.add(152.09);
		
		Double total = 0d;
		for (Number number : myNumbers) {
			total += number.doubleValue();
		}

		System.out.println("The total is " + total);
	}

}
