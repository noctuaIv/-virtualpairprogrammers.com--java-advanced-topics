package performance;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

import sortingObjects.Book;

public class Main {

	public static void main(String[] args) {
		Random randomGenerator = new Random();
		List<Book> list = new ArrayList<Book>();
		for (int i = 0; i < 1000000; i++) {
			list.add(new Book(i,"test" + randomGenerator.nextInt(2000000),"test" + i));
		}
		
		Long start = System.nanoTime();
		Collections.sort(list, new TitleSort());
		Long end =  System.nanoTime();
		
		System.out.println("ArrayList: " + (end - start) / 1e6);
		
	}
}
