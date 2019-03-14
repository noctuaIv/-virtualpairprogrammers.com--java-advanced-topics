import java.util.List;
import java.util.Map;
import java.util.function.Predicate;


public class Main {

	public static void main(String[] args) {

		BookCollection bc = new BookCollection();
		bc.findBooks(book -> book.getTitle().toLowerCase().contains("men")).forEach(System.out::println);
		
		Map<Integer,String> bookMap = bc.findBookTitles(book -> book.getTitle().toLowerCase().contains("men"));
		bookMap.forEach((k,v) -> System.out.println(k+" : " + v));
		
		System.out.println(bc.howManyMatchingBooks(b -> b.getAuthor().startsWith("D")));
	}
}
