package p304;

public class Employee {

	static final int ENGINEER = 0;

	static final int SALESMAN = 1;

	static final int MANAGER = 2;

	static Employee create(String name) {
		try {
			return (Employee) Class.forName(name).newInstance();
		} catch (Exception e) {
			throw new IllegalArgumentException("インスタンス化不能" + name);
		}
	}

}
