public class MoveField {

	private class Account {

		private AccountType _type;

		double interestForAmount_days(double amount, int days) {
			return _type.getInterestRate() * amount * days / 365;
		}

	}

	private class AccountType {

		private double _interestRate;

		public double getInterestRate() {
			return _interestRate;
		}

		public void setInterestRate(double interestRate) {
			_interestRate = interestRate;
		}

	}

}
