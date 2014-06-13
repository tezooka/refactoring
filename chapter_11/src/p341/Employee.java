package p341;

public class Employee implements Billable {

    @Override
    public int getRate() {
        return 0;
    }

    @Override
    public boolean hasSpecialSkill() {
        return false;
    }

}
