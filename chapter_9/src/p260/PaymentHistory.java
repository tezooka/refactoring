package p260;

public class PaymentHistory {

	static PaymentHistory newNull() {
		return new NullPaymentHistory();
	}

	int getWeeksDelinquentInLastYear() {
		return 0;
	}

}
