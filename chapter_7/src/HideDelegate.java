public class HideDelegate {

    private class Person {

        Department _department;

        public void setDepartment(Department arg) {
            _department = arg;
        }

        public Person getManager() {
            return _department.getManager();
        }

    }

    private class Department {

        private String _chargeCode;

        private final Person _manager;

        public Department(Person manager) {
            _manager = manager;
        }

        public Person getManager() {
            return _manager;
        }

    }

}
