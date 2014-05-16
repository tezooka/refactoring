public class RemoveMiddleMan {

    private class Person {

        Department _department;

        public Department getDepartment() {
            return _department;
        }

    }

    private class Department {

        private final Person _manager;

        public Department(Person manager) {
            _manager = manager;
        }

        public Person getManager() {
            return _manager;
        }

    }

}
