package customers;

public class Person implements CustomerInterface {
	private int id;
	private String name;
	private String address;
	private int age;
	
	public Person(int id, String name, String address, int age) {
		this.id = id;
		this.name = name;
		this.address = address;
		this.age = age;
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
	
	public int getAge() {
		return age;
	}

}
