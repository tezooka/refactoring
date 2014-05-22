package p255;

public class Manager extends EmployeeType {

    @Override
    int getTypeCode() {
        return MANAGER;
    }

    @Override
    int payAmount(Employee employee) {
        return employee.getMontlySalary() + employee.getBonus();
    }

}
