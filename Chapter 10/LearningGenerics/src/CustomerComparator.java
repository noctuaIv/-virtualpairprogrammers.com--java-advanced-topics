import java.util.Comparator;


public class CustomerComparator implements Comparator<Customer> {

	@Override
	public int compare(Customer arg0, Customer arg1) {
		return arg0.getName().compareTo(arg1.getName());
	}

}
