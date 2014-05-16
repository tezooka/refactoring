import java.util.Date;

public class IntroduceForeignMethod {

    private Date previousEnd;

    Date newStart = nextDay(previousEnd);

    private Date nextDay(Date arg) {
        return new Date(arg.getYear(), arg.getMonth(), arg.getDate() + 1);
    }

}
