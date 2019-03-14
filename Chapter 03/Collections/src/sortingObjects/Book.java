package sortingObjects;

import java.util.Comparator;

public class Book implements Comparable<Book> {
	
	
	public static class ReverseTitleComparator implements Comparator<Book> {

		@Override
		public int compare(Book arg0, Book arg1) {
			return -arg0.getTitle().compareTo(arg1.getTitle());
		}

	}
	
	
	
	private int id;
	private String title;
	private String author;
	
	public int getId() {
		return id;
	}

	public String getTitle() {
		return title;
	}
	
	public String getAuthor() {
		return author;
	}

	public Book(int id, String title, String author) {
		this.id = id;
		this.title = title;
		this.author = author;
	}
	
	public String toString() {
		return title + " by " + author;
	}

	@Override
	public int compareTo(Book o) {
		int result = this.title.compareTo(o.getTitle());
		if (result == 0) {
			return (this.author.compareTo(o.getAuthor()));
		}
		else {
			return result;
		}
	}
		
}
