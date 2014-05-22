public class ReplaceSubclassWithFields {

    static class Person {

        private final boolean _isMale;

        private final char _code;

        public Person(boolean isMale, char code) {
            _isMale = isMale;
            _code = code;
        }

        static Person createMale() {
            return new Person(true, 'M');
        }

        static Person createFemale() {
            return new Person(false, 'F');
        }

        boolean isMale() {
            return _isMale;
        }

        int getCode() {
            return _code;
        }

    }

}
