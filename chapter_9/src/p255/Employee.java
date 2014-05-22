package p255;

public class Employee {

    private int _monthlySalary;

    private int _commission;

    private int _bonus;

    private EmployeeType _type;

    int payAmount() {
        return _type.payAmount(this);
    }

    public int getMontlySalary() {
        return _monthlySalary;
    }

    public int getCommission() {
        return _commission;
    }

    public int getBonus() {
        return _bonus;
    }

}
