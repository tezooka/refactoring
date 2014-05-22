package p243;

public class ConsolidateDublicateConditionFragments {

    public static void main(String[] args) {
        double price = 0;
        double total;
        if (isSpecialDeal()) {
            total = price * 0.95;
        } else {
            total = price * 0.98;
        }
        send();
    }

    private static boolean isSpecialDeal() {
        return false;
    }

    private static void send() {

    }
}
