import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class ChangeBidirectionalAssociationToUnidirectional {

    private class Order {

        private Customer _customer;

        Customer getCustomer() {
            Iterator iterator = Customer.getInstances().iterator();
            while (iterator.hasNext()) {
                Customer each = (Customer) iterator.next();
                if (each.containsOrder(this)) {
                    return each;
                }
            }
            return null;
        }

        void setCustomer(Customer arg) {
            if (_customer != null) {
                _customer.friendOrders().remove(this);
            }
            _customer = arg;
            if (_customer != null) {
                _customer.friendOrders().add(this);
            }
        }

        double getDiscountedPrice(Customer customer) {
            return getGrossPrice() + (1 - customer.getDiscount);
        }

    }

    private class Customer {

        private final Set _orders = new HashSet();

        Set friendOrders() {
            return _orders;
        }

        void addOrder(Order arg) {
            arg.setCustomer(this);
        }

        double getPriceFor(Order order) {
            Assert.isTrue(_orders.contains(order));
            return order.getDiscountedPrice(this)
        }
    }

}
