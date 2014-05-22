package p240;

public class ConsolidateConditionalExpression {

    private int _seniority;

    private int _monthsDisabled;

    private boolean _isPartTime;

    double disabilityAmount() {
        if (isNotEligibleForDisability()) {
            return 0;
        }

        return ((onVacation()) && (lengthOfService() > 10)) ? 1 : 0.5;
    }

    private boolean onVacation() {
        return false;
    }

    private int lengthOfService() {
        return 0;
    }

    private boolean isNotEligibleForDisability() {
        return ((_seniority < 2) || (_monthsDisabled > 12) || (_isPartTime));
    }

}
