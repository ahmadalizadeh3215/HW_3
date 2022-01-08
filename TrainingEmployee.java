package HW3;

import java.util.Scanner;

public class TrainingEmployee extends Employee {
    private Employee[] employees;
    private Integer emptyIndex=0;
    private String course;
    private int courseCode;
    Scanner scanner = new Scanner(System.in);

    public TrainingEmployee(String firstName, String lastName, String nationalCode, String passWord, String employeeCode, Integer salary, String status) {
        super(firstName, lastName, nationalCode, passWord, employeeCode, salary, status);
        this.employees=new Employee[1000];
    }
    public void registerEmployee(String firstName, String lastName, String nationalCode, String passWord, String employeeCode, Integer salary, String status ){
        Employee employee= new Employee(firstName,lastName,nationalCode,passWord,employeeCode,salary,status);
        employees[emptyIndex]=employee;
        emptyIndex++;
    }
    public void updateEmployee(String nationalCode,String employeeCode){
        for (int i = 0; i < emptyIndex; i++) {
            if(employees[i].getNationalCode().equals(nationalCode) && employees[i].getEmployeeCode().equals(employeeCode)){
                System.out.println("please enter your firstname");
                String firstname= scanner.nextLine();
                employees[i].setFirstName(firstname);
                System.out.println("please enter your lastname");
                String lastname= scanner.nextLine();
                employees[i].setLastName(lastname);
                System.out.println("please enter your nationalCode ");
                String nationalcode= scanner.nextLine();
                employees[i].setNationalCode(nationalcode);
                System.out.println("please enter your employeecode");
                String employeecode= scanner.nextLine();
                employees[i].setEmployeeCode(employeecode);
                System.out.println("please enter your Status");
                String status=scanner.nextLine();
                employees[i].setStatus(status);
                System.out.println("Updated Sucessfully ");

            }else System.out.println(" Invalid your nationalCode OR your employeeCode !!!");

        }
    }
    public void removeEmployee(String nationalCode,String employeeCode){
        for (int i = 0; i < emptyIndex; i++) {
            if(employees[i].getNationalCode().equals(nationalCode) && employees[i].getEmployeeCode().equals(employeeCode)) {
                System.out.println(" Are You Sure??\n 1.YES\n2.NO");
                int alarm=scanner.nextInt();
                if(alarm==1) {
                    employees[i].setFirstName("");
                    employees[i].setLastName("");
                    employees[i].setNationalCode("");
                    employees[i].setEmployeeCode("");
                    employees[i].setStatus("");
                    employees[i].setPassWord("");
                }else break;
            }
            }
    }





}

