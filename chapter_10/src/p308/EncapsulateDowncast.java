package p308;

public class EncapsulateDowncast {

    private Site theSite;

    Reading lastReading() {
        return theSite.lastReading();
    }
}
