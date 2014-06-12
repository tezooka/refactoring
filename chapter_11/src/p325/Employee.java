package p325;

public class Employee {

    protected String _name;

    protected String _id;

    public Employee(String name, String id) {
        _name = name;
        _id = id;
    }

    void initialize() {
        if (isPriviliged()) {
            assignCar();
        }
    }

    boolean isPriviliged() {
        return false;
    }

    void assignCar() {

    }

}
