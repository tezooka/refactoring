package p260;

public class NullPaymentHistory extends PaymentHistory {

	@Override
	int getWeeksDelinquentInLastYear() {
		return 0;
	}

}
