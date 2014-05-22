package p250;

public class ReplaceNestedConditionalWithGuardClauses {

    private static final double ADJ_FACTOR = 0;

    private boolean _isDead;

    private boolean _isSepareted;

    private boolean _isRetired;

    private double _capital;

    private double _intRate;

    private double _duration;

    private double _income;

    double getPayAmount() {
        if (_isDead) {
            return deadAmount();
        }
        if (_isSepareted) {
            return separetedAmount();
        }
        if (_isRetired) {
            return retiredAmount();
        }
        return normalPayAmount();
    }

    private double deadAmount() {
        return 0;
    }

    private double separetedAmount() {
        return 0;
    }

    private double retiredAmount() {
        return 0;
    }

    private double normalPayAmount() {
        return 0;
    }

    public double getAdjustCapital() {
        if (_capital <= 0.0) {
            return 0.0;
        }
        if (_intRate <= 0.0 || _duration <= 0.0) {
            return 0.0;
        }
        return (_income / _duration) * ADJ_FACTOR;
    }

}
