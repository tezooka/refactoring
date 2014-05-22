package p260;

public class Site {

	Customer _customer;

	public Customer getCustomer() {
		return (_customer == null) ? Customer.newNull() : _customer;
	}

}
