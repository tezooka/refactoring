package p308;

import java.util.Vector;

public class Site {

    Vector readings;

    Reading lastReading() {
        return (Reading) readings.lastElement();
    }
}
