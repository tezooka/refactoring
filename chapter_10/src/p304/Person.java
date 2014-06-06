package p304;

public class Person {

	static Person createMale() {
		return new Male();
	}

	static Person createFemale() {
		return new Female();
	}

}
