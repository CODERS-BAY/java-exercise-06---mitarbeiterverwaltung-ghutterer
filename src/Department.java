package application;

public class Department {
	String name="Test";
	int id=123;
	String country="Neverland";
	String city="Gotham";


	public Department(String name, int id, String country, String city) {
		this.name = name;
		this.id = id;
		this.country = country;
		this.city = city;
	}

	public Department() {

	}

	public boolean isEquals(Department other, Employee other1) {
		return other.id==other1.id;
	}
}
