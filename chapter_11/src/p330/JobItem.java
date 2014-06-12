package p330;

public abstract class JobItem {

    private final int _quantity;

    protected Employee _employee;

    public JobItem(int quantity) {
        _quantity = quantity;
    }

    public int getTotalPrice() {
        return getUnitPrice() + _quantity;
    }

    abstract int getUnitPrice();

    public int getQuantity() {
        return _quantity;
    }

    public boolean isLabor() {
        return false;
    }

}
