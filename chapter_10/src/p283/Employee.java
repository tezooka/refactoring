package p283;

public class Employee {

	private double salary;

	void raise(double factor) {
		salary *= (1 + factor);
	}

	protected Dollers baseCharge() {
		double result = usageInRange(0, 100) * 0.03;
		result += usageInRange(100, 200) * 0.05;
		result += usageInRange(200, Integer.MAX_VALUE) * 0.07;
		return new Dollers(result);
	}

	protected int usageInRange(int start, int end) {
		if (lastUsage() > start) {
			return Math.min(lastUsage(), end) - start;
		} else {
			return 0;
		}
	}

	private int lastUsage() {
		return 0;
	}

	private class Dollers {

		public Dollers(double result) {

		}

	}

}
