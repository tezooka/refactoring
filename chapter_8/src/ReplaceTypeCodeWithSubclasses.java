public class ReplaceTypeCodeWithSubclasses {

	static abstract class Employee {

		private final int _type;

		static final int ENGINEER = 0;

		static final int SALESMAN = 1;

		static final int MANGER = 2;

		private Employee(int type) {
			_type = type;
		}

		static Employee create(int type) {
			switch (type) {
			case ENGINEER:
				return new Engineer();
			case SALESMAN:
				return new Salesman();
			case MANGER:
				return new Manager();
			default:
				throw new IllegalArgumentException("タイプコードの値が不正");
			}
		}

		abstract int getType();

	}

	class Engineer extends Employee {

		public Engineer() {
			super(ENGINEER);
		}

		@Override
		public int getType() {
			return Employee.ENGINEER;
		}

	}

	class Salesman extends Employee {

		public Salesman() {
			super(SALESMAN);
		}

		@Override
		public int getType() {
			return Employee.SALESMAN;
		}

	}

	class Manager extends Employee {

		public Manager() {
			super(MANGER);
		}

		@Override
		public int getType() {
			return Employee.MANGER;
		}

	}

}
