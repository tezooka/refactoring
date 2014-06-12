package p325;

public class Manager extends Employee {

    private final int _grade;

    public Manager(String name, String id, int grade) {
        super(name, id);
        _grade = grade;
        initialize();
    }

    @Override
    boolean isPriviliged() {
        return _grade > 4;
    }

}
