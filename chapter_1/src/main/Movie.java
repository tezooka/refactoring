package main;

public class Movie {

    public static final int CHILDRENS = 2;

    public static final int REGULAR = 0;

    public static final int NEW_RELEASE = 1;

    private final String _title;

    private Price _price;

    public Movie(String title, int priceCode) {
        _title = title;
        setPriceCode(priceCode);
    }

    public int getPriceCode() {
        return _price.getPriceCode();
    }

    public void setPriceCode(int arg) {
        switch (arg) {
        case REGULAR:
            _price = new RegularPrice();
            break;
        case NEW_RELEASE:
            _price = new NewReleasePrice();
            break;
        case CHILDRENS:
            _price = new ChildrensPrice();
            break;
        default:
            throw new IllegalArgumentException("不正な料金コード");
        }
    }

    public String getTitle() {
        return _title;
    }

    double getCharge(int dayRented) {
        return _price.getCharge(dayRented);
    }

    public int getFrequentRentalPoints(int dayRented) {
        return _price.getFrequentRentarPoints(dayRented);
    }

}
