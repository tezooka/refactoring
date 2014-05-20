public class SelfEncapsulateField {

    private class IntRange {

        private int _low;

        private int _high;

        public IntRange(int low, int high) {
            initialize(low, high);
        }

        private void initialize(int low, int high) {
            _low = low;
            _high = high;
        }

        boolean include(int arg) {
            return arg >= _low && arg <= _high;
        }

        void grow(int factor) {
            _high = _high * factor;
        }

        public int getHigh() {
            return _high;
        }

        public void setHigh(int high) {
            _high = high;
        }

        public int getLow() {
            return _low;
        }

        public void setLow(int low) {
            _low = low;
        }

    }

    private class CappedRange extends IntRange {

        private int _cap;

        public CappedRange(int low, int high, int cap) {
            super(low, high);
            _cap = cap;
        }

        public int getCap() {
            return _cap;
        }

        public void setCap(int cap) {
            _cap = cap;
        }

    }

}
