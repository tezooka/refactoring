package p255;

public class Salesman extends EmployeeType {

    @Override
    int getTypeCode() {
        return SALESMAN;
    }

    @Override
    int payAmount(Employee employee) {
        return employee.getMontlySalary() + employee.getCommission();
    }

}
