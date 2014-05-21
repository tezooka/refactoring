import java.awt.Frame;
import java.awt.TextField;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.util.Observable;
import java.util.Observer;

public class DuplicateObsevedData {

    private class IntervelWindow extends Frame implements Observer {

        private TextField _startField;

        private TextField _endField;

        private TextField _lengthField;

        private final Interval _subject;

        public IntervelWindow() {
            _subject = new Interval();
            _subject.addObserver(this);
            update(_subject, null);
        }

        @Override
        public void update(Observable observed, Object arg) {
            _startField.setText(_subject.getStart());
            _endField.setText(_subject.getEnd());
            _lengthField.setText(_subject.getLength());
        }

        private class SymFocus extends FocusAdapter {

            @Override
            public void focusLost(FocusEvent e) {
                Object object = e.getSource();
                if (object == _startField) {
                    StartField_FocusLost(e);
                } else if (object == _endField) {
                    EndField_FocusLost(e);
                } else if (object == _lengthField) {
                    LengthField_FocusLost(e);
                }
            }

            void StartField_FocusLost(FocusEvent event) {
                if (isNotInteger(_startField.getText())) {
                    _startField.setText("0");
                }
                calculateLength();
            }

            void EndField_FocusLost(FocusEvent event) {
                setEnd(_endField.getText());
                if (isNotInteger(getEnd())) {
                    setEnd("0");
                }
                calculateLength();
            }

            void LengthField_FocusLost(FocusEvent event) {
                if (isNotInteger(_lengthField.getText())) {
                    _lengthField.setText("0");
                }
                calculateEnd();
            }

            private boolean isNotInteger(String text) {
                return false;
            }

            private void calculateLength() {
                try {
                    int start = Integer.parseInt(_startField.getText());
                    int end = Integer.parseInt(getEnd());
                    int length = end - start;
                    _lengthField.setText(String.valueOf(length));
                } catch (NumberFormatException e) {
                    throw new RuntimeException("予期しない数字形式ノエラー");
                }
            }

            private void calculateEnd() {
                try {
                    int start = Integer.parseInt(_startField.getText());
                    int length = Integer.parseInt(_lengthField.getText());
                    int end = start + length;
                    setEnd(String.valueOf(end));
                } catch (NumberFormatException e) {
                    throw new RuntimeException("予期しない数字形式ノエラー");
                }
            }

            String getStart() {
                return _subject.getStart();
            }

            void setStart(String arg) {
                _subject.setStart(arg);
            }

            String getEnd() {
                return _subject.getEnd();
            }

            void setEnd(String arg) {
                _subject.setEnd(arg);
            }

            String getLength() {
                return _subject.getLength();
            }

            void setLength(String arg) {
                _subject.setLength(arg);
            }

        }

    }

    private class Interval extends Observable {

        private String _start = "0";

        private String _end = "0";

        private String _length = "0";

        public String getStart() {
            return _start;
        }

        public void setStart(String arg) {
            _start = arg;
            setChanged();
            notifyObservers();
        }

        public String getEnd() {
            return _end;
        }

        public void setEnd(String arg) {
            _end = arg;
            setChanged();
            notifyObservers();
        }

        public String getLength() {
            return _length;
        }

        public void setLength(String arg) {
            _length = arg;
            setChanged();
            notifyObservers();
        }

    }

}
