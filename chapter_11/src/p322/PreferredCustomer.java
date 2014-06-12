package p322;

import java.util.Date;

public class PreferredCustomer extends Customer {

    @Override
    double chargeFor(Date start, Date end) {
        return 1;
    }

}
