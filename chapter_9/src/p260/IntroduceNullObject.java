package p260;

public class IntroduceNullObject {

	public static void main(String[] args) {
		Customer customer = new Customer();
		BillingPlan plan = customer.getPlan();
		String customerName = customer.getName();

		int weeksDelinquent = customer.getHistory()
				.getWeeksDelinquentInLastYear();

		customer.setPlan(BillingPlan.special());
	}

}
