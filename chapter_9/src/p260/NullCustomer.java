package p260;

public class NullCustomer extends Customer {

	@Override
	public boolean isNull() {
		return true;
	}

	@Override
	public BillingPlan getPlan() {
		return BillingPlan.basic();
	}

	@Override
	public void setPlan(BillingPlan plan) {

	}

	@Override
	public String getName() {
		return "occupant";
	}

	@Override
	public PaymentHistory getHistory() {
		return NullPaymentHistory.newNull();
	}

}
