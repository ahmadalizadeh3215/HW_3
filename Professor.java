package HW3;

public class Professor extends Employee {
    private Integer countUnit;
    private Integer setNumber;

    public Professor(String firstName, String lastName, String nationalCode, String passWord, String employeeCode, Integer salary, String status ) {
        super(firstName, lastName, nationalCode, passWord, employeeCode, salary, status);
    }


    @Override
    public double calcSalary() {
        if (this.getStatus().equals("science Committee")) {
            return super.calcSalary()+ (getCountUnit() * 10);
        } else
            return (getCountUnit() * 10);

    }

    public Integer getCountUnit() {
        return countUnit;
    }

    public void setCountUnit(Integer countUnit) {
        this.countUnit = countUnit;
    }

    public Integer getSetNumber() {
        return setNumber;
    }

    public void setSetNumber(Integer setNumber) {
        this.setNumber = setNumber;
    }


}
