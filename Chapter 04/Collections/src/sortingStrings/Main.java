package sortingStrings;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
	
	public static void main(String[] args) {
		String test1 = "goodbye";
		String test2 = "hello";
		System.out.println(test1.compareTo(test2));
		
		
		
		List<String> strings = new ArrayList<String>();
		strings.add("one");
		strings.add("two");
		strings.add("three");
		strings.add("four");
		strings.add("five");
		strings.add("six");
		strings.add("seven");
		
		Collections.sort(strings);
		
		for (String nextString : strings) {
			System.out.println(nextString);
		}
	}
}
