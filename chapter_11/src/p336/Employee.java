package p336;

public class Employee extends Party {

    private final String _id;

    private final int _annualCost;

    public Employee(String name, String id, int annualCost) {
        super(name);
        _id = id;
        _annualCost = annualCost;
    }

    @Override
    public int getAnnualCost() {
        return _annualCost;
    }

    public String getId() {
        return _id;
    }

}
