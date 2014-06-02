package p279;

public class SeparateQueryFromModifier {

	void checkSecurity(String[] people) {
		sendAlert(people);
		String found = foundPerson(people);
		someLaterCode(found);
	}

	void sendAlert(String[] people) {
		if (foundPerson(people).equals("")) {
			sendAlert();
		}
	}

	String foundPerson(String[] people) {
		for (int i = 0; i < people.length; i++) {
			if (people[i].equals("Don")) {
				return "Don";
			}
			if (people[i].equals("John")) {
				return "John";
			}
		}
		return "";
	}

	private void sendAlert() {

	}

	private void someLaterCode(String found) {

	}

}
