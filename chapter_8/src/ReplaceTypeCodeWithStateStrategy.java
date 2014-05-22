public class ReplaceTypeCodeWithStateStrategy {

    class Employee {

        private EmployeeType _type;

        private int _monthlySalary;

        private int _commission;

        private int _bonus;

        public Employee(int type) {
            setType(type);
        }

        public int getType() {
            return _type.getTypeCode();
        }

        public void setType(int arg) {
            _type = EmployeeType.newType(arg);
        }

        int payAmount() {
            switch (getType()) {
            case EmployeeType.ENGINEER:
                return _monthlySalary;
            case EmployeeType.SALESMAN:
                return _monthlySalary + _commission;
            case EmployeeType.MANAGER:
                return _monthlySalary + _bonus;
            default:
                throw new IllegalArgumentException("不正な従業員");
            }
        }

    }

    abstract static class EmployeeType {

        static final int ENGINEER = 0;

        static final int SALESMAN = 1;

        static final int MANAGER = 2;

        abstract int getTypeCode();

        static EmployeeType newType(int code) {
            switch (code) {
            case ENGINEER:
                return new Engineer();
            case SALESMAN:
                return new Salesman();
            case MANAGER:
                return new Manager();
            default:
                throw new IllegalArgumentException("不正な従業員コード");
            }
        }

    }

    static class Engineer extends EmployeeType {

        @Override
        int getTypeCode() {
            return ENGINEER;
        }

    }

    static class Salesman extends EmployeeType {

        @Override
        int getTypeCode() {
            return SALESMAN;
        }

    }

    static class Manager extends EmployeeType {

        @Override
        int getTypeCode() {
            return MANAGER;
        }

    }

}
