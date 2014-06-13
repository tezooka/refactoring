package p345;

public class HtmlStatement extends Statement {

    @Override
    String headerString(Customer aCustomer) {
        return "<H1>Rental Record for <EM>" + aCustomer.getName() + "</EM></H1><P>\n";
    }

    @Override
    String eachRentalString(Rental aRental) {
        return "\t" + aRental.getMovie().getTitle() + ": " + String.valueOf(aRental.getCharge()) + "<BR>\n";
    }

    @Override
    String footerString(Customer aCustomer) {
        return "<P>Amount owed is <EM>" + String.valueOf(aCustomer.getTotalCharge()) + "</EM><P>\n" + "On this rental you earnd <EM>" + String.valueOf(aCustomer.getTotalFrequentRentarPoints())
                + "</EM> frequent renter points<P>";
    }

}
