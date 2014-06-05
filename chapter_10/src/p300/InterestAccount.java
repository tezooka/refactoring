package p300;

public class InterestAccount extends Account {

    private final double _interestRate;

    InterestAccount(String id, double rate) {
        super(id);
        _interestRate = rate;
    }

}
