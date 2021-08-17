package mx.xoco.nuniez.single_responsibility;

import lombok.Data;

@Data
public class Employee {
    private Integer employeeId;
    private String employeeName;
    private String employeeAddress;
    private String contactNumber;
    private String employeeType;

    public void save() {
        new EmployeeRepository().save(this);
    }

    public void calculateTax() {
        new TaxCalculator().calculateTax(this);
    }

}
