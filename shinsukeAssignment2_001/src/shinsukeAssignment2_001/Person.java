package shinsukeAssignment2_001;

public class Person {
	private String firstName;
	private String lastName;
	private String address;
	
	public Person(String firstName, String lastName, String address) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.address = address;
	}

	public String getFName() {
		return firstName; 
	}
	public String getLName() {
		return lastName;
	}
	public String getAddress() {
		return address;
	}
	
	@Override
	public String toString() {
		return firstName + " " + lastName + ", " + address;
	}
}
