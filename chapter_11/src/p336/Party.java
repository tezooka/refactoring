package p336;

abstract class Party {

    private final String _name;

    public Party(String name) {
        _name = name;
    }

    public String getName() {
        return _name;
    }

    abstract public int getAnnualCost();

}
