import java.util.HashSet;
import java.util.Set;

public class ChangeBidirectionalAssociationToUnidirectional {

    private class Order {

        private final Set _customers = new HashSet();

        void addCustomer(Customer arg) {
            arg.friendOrders().add(this);
            _customers.add(arg);
        }

        void removeCustomer(Customer arg) {
            arg.friendOrders().remove(this);
            _customers.remove(arg);
        }

    }

    private class Customer {

        private final Set _orders = new HashSet();

        Set friendOrders() {
            return _orders;
        }

        void addOrder(Order arg) {
            arg.addCustomer(this);
        }

        void removeOrder(Order arg) {
            arg.removeCustomer(this);
        }

    }

}
