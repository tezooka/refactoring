package p322;

import java.util.Date;

public class RegularCustomer extends Customer {

    @Override
    double chargeFor(Date start, Date end) {
        return 0;
    }

}
