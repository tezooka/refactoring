package p310;

public class ReplaceErrorCodeWithException {

    public static void main(String[] args) {
        int amount = 0;
        Account account = new Account();
        try {
            account.withDraw(amount);
            doTheUsualThing();
        } catch (BalanceException e) {
            e.printStackTrace();
            handleOverdrawn();
        }
    }

    private static void doTheUsualThing() {

    }

    private static void handleOverdrawn() {

    }

}
