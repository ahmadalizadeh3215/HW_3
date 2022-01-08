package HW3;

public class Student extends Person{
private String studentCode;
private String course;
private String unit;
private String chooseUnit;

    public Student(String firstName, String lastName, String nationalCode, String passWord, String studentCode, String course, String unit, String chooseUnit) {
        super(firstName, lastName, nationalCode, passWord);
        this.studentCode = studentCode;
        this.course = course;
        this.unit = unit;
        this.chooseUnit = chooseUnit;
    }

    public String getStudentCode() {
        return studentCode;
    }

    public void setStudentCode(String studentCode) {
        this.studentCode = studentCode;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public String getChooseUnit() {
        return chooseUnit;
    }

    public void setChooseUnit(String chooseUnit) {
        this.chooseUnit = chooseUnit;
    }
}
