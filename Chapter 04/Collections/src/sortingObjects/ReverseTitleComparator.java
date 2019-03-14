package sortingObjects;

import java.util.Comparator;

public class ReverseTitleComparator implements Comparator<Book> {

	@Override
	public int compare(Book arg0, Book arg1) {
		return -arg0.getTitle().compareTo(arg1.getTitle());
	}

}
