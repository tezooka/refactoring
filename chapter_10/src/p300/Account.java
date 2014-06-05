package p300;

public class Account {

    private String _id;

    Account(String id) {
        initializedId(id);
    }

    public void initializedId(String arg) {
        _id = "ZZ" + arg;
    }

}
