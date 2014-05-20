import java.util.Collection;
import java.util.Iterator;

public class ReplaceDataValueWithObject {

    private static int numberOfOrderFor(Collection<Order> order, String customer) {
        int result = 0;
        Iterator<Order> iterator = order.iterator();
        while (iterator.hasNext()) {
            Order each = iterator.next();
            if (each.getCustomerName().equals(customer)) {
                result++;
            }
        }
        return result;
    }

    private class Order {

        private Customer _customer;

        public Order(String customerName) {
            _customer = new Customer(customerName);
        }

        public String getCustomerName() {
            return _customer.getName();
        }

        public void setCustomer(String customerName) {
            _customer = new Customer(customerName);
        }

    }

    private class Customer {

        private final String _name;

        public Customer(String name) {
            _name = name;
        }

        public String getName() {
            return _name;
        }

    }

}
