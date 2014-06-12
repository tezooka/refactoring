package p322;

import java.util.Date;

public abstract class Customer {

    Date lastBillDate;

    void addBill(Date date, double amount) {

    }

    void createBill(Date date) {
        double chargeAmount = chargeFor(lastBillDate, date);
        addBill(date, chargeAmount);
    }

    abstract double chargeFor(Date lastBillDate2, Date date);

}
