package p341;

public class Timesheet {

    double charge(Billable emp, int days) {
        int base = emp.getRate() * days;
        if (emp.hasSpecialSkill()) {
            return base * 1.05;
        } else {
            return base;
        }
    }

}
