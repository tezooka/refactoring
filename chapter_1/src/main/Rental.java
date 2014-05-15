package main;

public class Rental {

    private final Movie _movie;

    private final int _dayRented;

    public Rental(Movie movie, int dayRented) {
        _movie = movie;
        _dayRented = dayRented;
    }

    public Movie getMovie() {
        return _movie;
    }

    public int getDayRented() {
        return _dayRented;
    }

    double getCharge() {
        return _movie.getCharge(_dayRented);
    }

    int getFrequentRentalPoints() {
        return _movie.getFrequentRentalPoints(_dayRented);
    }

}
