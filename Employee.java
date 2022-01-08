package HW3;

public class Employee extends Person {
    private String employeeCode;
    private Integer salary;
    private String status;

    public Employee(String firstName, String lastName, String nationalCode, String passWord, String employeeCode, Integer salary, String status) {
        super(firstName, lastName, nationalCode, passWord);
        this.employeeCode = employeeCode;
        this.salary = salary;
        this.status = status;

    }

    public String getEmployeeCode() {
        return employeeCode;
    }

    public void setEmployeeCode(String employeeCode) {
        this.employeeCode = employeeCode;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    public double fixedSalary = 5000000;

    public double calcSalary() {
            return fixedSalary;
    }
}
