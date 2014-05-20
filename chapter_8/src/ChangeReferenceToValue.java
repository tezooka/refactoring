public class ChangeReferenceToValue {

    private class Currency {

        private final String _code;

        private Currency(String code) {
            _code = code;
        }

        public String getCode() {
            return _code;
        }

        @Override
        public boolean equals(Object arg) {
            if (!(arg instanceof Currency)) {
                return false;
            }
            Currency other = (Currency) arg;
            return (_code.equals(other._code));
        }

        @Override
        public int hashCode() {
            return _code.hashCode();
        }

    }

}
