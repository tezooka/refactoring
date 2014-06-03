package p285;

public class ReplaceParameterWithExplictMethod {

	public static void main(String[] args) {
		Employee kent = Employee.createEngineer();
	}

	private static class Employee {

		static Employee createEngineer() {
			return new Engineer();
		}

		static Employee createSalesman() {
			return new Salesman();
		}

		static Employee createManager() {
			return new Manager();
		}

	}

	private static class Engineer extends Employee {

	}

	private static class Salesman extends Employee {

	}

	private static class Manager extends Employee {

	}

}
