public class ReplaceTypeCodeWithClass {

	public static void main(String[] args) {
		Person thePerson = new Person(BloodGroup.A);
		thePerson.getBloodGroup().getCode();
		thePerson.setBloodGroup(BloodGroup.AB);
	}

	static class Person {

		private BloodGroup _bloodGroup;

		public Person(BloodGroup bloodGroup) {
			_bloodGroup = bloodGroup;
		}

		public BloodGroup getBloodGroup() {
			return _bloodGroup;
		}

		public void setBloodGroup(BloodGroup arg) {
			_bloodGroup = arg;
		}

	}

	static class BloodGroup {

		public static final BloodGroup O = new BloodGroup(0);
		public static final BloodGroup A = new BloodGroup(1);
		public static final BloodGroup B = new BloodGroup(2);
		public static final BloodGroup AB = new BloodGroup(3);
		private static final BloodGroup[] _values = { O, A, B, AB };

		private final int _code;

		private BloodGroup(int code) {
			_code = code;
		}

		private int getCode() {
			return _code;
		}

		private static BloodGroup code(int arg) {
			return _values[arg];
		}

	}

}
