package HW3;

public class Person {
    private String firstName ;
    private String lastName ;
    private String nationalCode;
    private String passWord;

    public Person() {
    }

    public Person(String firstName, String lastName, String nationalCode,String passWord) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.nationalCode = nationalCode;
        this.passWord=passWord;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getNationalCode() {
        return nationalCode;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }
    public String getPassWord() {return passWord;}

    public void setNationalCode(String nationalCode) {
        this.nationalCode = nationalCode;
    }

}
