package p336;

import java.util.Enumeration;
import java.util.Vector;

public class Department extends Party {

    private final Vector _staff = new Vector();

    public Department(String name) {
        super(name);
    }

    @Override
    public int getAnnualCost() {
        Enumeration e = getStaff();
        int result = 0;
        while (e.hasMoreElements()) {
            Party each = (Party) e.nextElement();
            result += each.getAnnualCost();
        }
        return result;
    }

    public int getHeadCount() {
        return _staff.size();
    }

    public Enumeration getStaff() {
        return _staff.elements();
    }

    public void addStaff(Employee arg) {
        _staff.addElement(arg);
    }

}
