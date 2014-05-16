import java.util.Date;

public class IntroduceLocalExtention {

    private class MfDateSub extends Date {

        public MfDateSub(String dateString) {
            super(dateString);
        }

        public MfDateSub(Date arg) {
            super(arg.getTime());
        }

        Date nextDay() {
            return new Date(getYear(), getMonth(), getDate() + 1);
        }
    }

    private class Client {

        private Date nextDay(Date arg) {
            return new MfDateSub(arg).nextDay();
        }

    }

}
