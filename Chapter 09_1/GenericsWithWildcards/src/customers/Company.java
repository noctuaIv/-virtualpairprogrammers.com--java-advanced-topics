package customers;

public class Company implements CustomerInterface {
	private int id;
	private String name;
	private String address;
	private String companyName;
	
	public Company(int id, String name, String address, String companyName) {
		this.id = id;
		this.name = name;
		this.address = address;
		this.companyName = companyName;
	}
	
	public int getId() {
		return id;
	}
	
	public String getName() {
		return name;
	}
	
	public String getAddress() {
		return address;
	}
	
	public String getCompanyName() {
		return companyName;
	}

}
