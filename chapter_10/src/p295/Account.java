package p295;

import java.util.Enumeration;
import java.util.Vector;

public class Account {

    private final Vector _entries = new Vector();

    double getFlowBetween(DateRange range) {
        double result = 0;
        Enumeration e = _entries.elements();
        while (e.hasMoreElements()) {
            Entry each = (Entry) e.nextElement();
            if (range.include(each.getDate())) {
                result += each.getValue();
            }
        }
        return result;
    }

}
