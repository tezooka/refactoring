package p255;

public class Engineer extends EmployeeType {

    @Override
    int getTypeCode() {
        return ENGINEER;
    }

    @Override
    int payAmount(Employee employee) {
        return employee.getMontlySalary();
    }

}
