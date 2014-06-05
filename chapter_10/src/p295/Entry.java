package p295;

import java.util.Date;

public class Entry {

    private final double _value;

    private final Date _chargeDate;

    Entry(double value, Date chargeDate) {
        _value = value;
        _chargeDate = chargeDate;
    }

    public double getValue() {
        return _value;
    }

    public Date getChargeDate() {
        return _chargeDate;
    }

    public Date getDate() {
        return null;
    }

}
