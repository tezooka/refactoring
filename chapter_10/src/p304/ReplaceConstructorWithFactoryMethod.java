package p304;

public class ReplaceConstructorWithFactoryMethod {

	public static void main(String[] args) {
		Employee emg = Employee.create("Engineer");

		Person kent = Person.createMale();
	}

}
