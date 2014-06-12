package p310;

public class Account {

    private int _balance;

    int withDraw(int amount) throws BalanceException {
        if (amount > _balance) {
            throw new BalanceException();
        } else {
            return 0;
        }
    }
}
