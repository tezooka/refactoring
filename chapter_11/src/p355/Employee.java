package p355;

public class Employee extends Person {

	@Override
	public String toString() {
		return "Emp: " + getLastName();
	}

}
