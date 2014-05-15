import java.util.Enumeration;
import java.util.Vector;

public class ExtractMethod {

    private Vector<Order> _orders;

    private String _name;

    void printOwing() {
        printBanner();
        double outstanding = getOutstanding();
        printDetails(outstanding);
    }

    void printOwing(double previousAmount) {
        printBanner();
        double outstanding = getOutstanding(previousAmount * 1.2);
        printDetails(outstanding);
    }

    void printBanner() {
        System.out.println("**************************");
        System.out.println("****** Custmer Owes ******");
        System.out.println("**************************");
    }

    double getOutstanding() {
        Enumeration<Order> e = _orders.elements();
        double result = 0.0;
        while (e.hasMoreElements()) {
            Order each = e.nextElement();
            result += each.getAmount();
        }
        return result;
    }

    double getOutstanding(double initialValue) {
        double result = initialValue;
        Enumeration<Order> e = _orders.elements();
        while (e.hasMoreElements()) {
            Order each = e.nextElement();
            result += each.getAmount();
        }
        return result;
    }

    void printDetails(double outstanding) {
        System.out.println("name: " + _name);
        System.out.println("amount: " + outstanding);
    }

}
