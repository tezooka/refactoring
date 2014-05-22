package p238;

import java.util.Date;

public class DecomposeConditional {

    private static final Date SUMMER_START = null;

    private static final Date SUMMER_END = null;

    private static int _summerRate;

    private static int _winterRate;

    private static int _winterServiceCharge;

    public static void main(String[] args) {
        Date date = new Date();
        int charge;
        int quantity = 0;
        if (notSummer(date)) {
            charge = winterCharge(quantity);
        } else {
            charge = summerCharge(quantity);
        }
    }

    private static int summerCharge(int quantity) {
        return quantity * _summerRate;
    }

    private static int winterCharge(int quantity) {
        return quantity * _winterRate + _winterServiceCharge;
    }

    private static boolean notSummer(Date date) {
        return date.before(SUMMER_START) || date.after(SUMMER_END);
    }

}
