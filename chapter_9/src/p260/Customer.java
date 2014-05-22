package p260;

public class Customer {

	private BillingPlan _plan;

	protected Customer() {

	}

	static Customer newNull() {
		return new NullCustomer();
	}

	public String getName() {
		return null;
	}

	public BillingPlan getPlan() {
		return _plan;
	}

	public void setPlan(BillingPlan plan) {
		_plan = plan;
	}

	public PaymentHistory getHistory() {
		return null;
	}

	public boolean isNull() {
		return false;
	}

}
