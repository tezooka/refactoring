public class InlineClass {

    private class Person {

        private String _name;

        private String _number;

        private String _areaCode;

        public String getTelephoneNumber() {
            return "(" + _areaCode + ")" + _number;
        }

        public String getName() {
            return _name;
        }

        String getNumber() {
            return _number;
        }

        void setNumber(String number) {
            _number = number;
        }

        String getAreaCode() {
            return _areaCode;
        }

        void setAreaCode(String areaCode) {
            _areaCode = areaCode;
        }

    }

}
