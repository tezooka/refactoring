package p345;

import java.util.Enumeration;
import java.util.Vector;

public class Customer {

    private Vector _rentals;

    public String statement() {
        return new TextStatement().value(this);
    }

    public String htmlStatement() {
        return new HtmlStatement().value(this);
    }

    public Enumeration getRentals() {
        return _rentals.elements();
    }

    public String getName() {
        return null;
    }

    public char[] getTotalCharge() {
        return null;
    }

    public char[] getTotalFrequentRentarPoints() {
        return null;
    }

}
