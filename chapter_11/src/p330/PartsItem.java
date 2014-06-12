package p330;

public class PartsItem extends JobItem {

    private final int _unitPrice;

    public PartsItem(int unitPrice, int quantity) {
        super(quantity);
        _unitPrice = unitPrice;
    }

    @Override
    public int getUnitPrice() {
        return _unitPrice;
    }

}
