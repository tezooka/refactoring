package p295;

import java.util.Date;

public class IntroduceParameterObject {

    private static Account anAccount;

    private static Date startDate;

    private static Date endDate;

    public static void main(String[] args) {
        double flow = anAccount.getFlowBetween(new DateRange(startDate, endDate));
    }

}
