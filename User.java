package HW3;

import java.util.Scanner;

public class User extends Person {
   private  Integer emptyIndex=0;
    private String username;
    private  Person[] users;


    public User(String firstName, String lastName, String nationalCode, String passWord, String username) {
        super(firstName, lastName, nationalCode, passWord);
        this.username = username;
        users = new Person[1000];
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    Scanner scanner = new Scanner(System.in);


    public void showMenu() {

        System.out.println(" > > > ((WelCome To System Education)) < < < ");
    }

    public void loginPage() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("1.SignUp\n2.SignIn");
        int login = scanner.nextInt();
        if (login == 1) {
            signUpPage();
        } else if (login == 2) {
            signinPage();
        } else
            System.out.println("The number is wrong. Try again  ");

    }

    public void signUpPage(String firstname,String lastname,String national_code,String password ) {
        System.out.println("Please Enter FirstName : ");
        //String firstname = scanner.nextLine();
        users[emptyIndex].setFirstName(firstname);
        System.out.println("Please Enter LastName : ");
//        String lastname = scanner.nextLine();
        users[emptyIndex].setLastName(lastname);
        System.out.println("Please Enter NationalCode : ");
       // String nationalcode = scanner.nextLine();
        users[emptyIndex].setNationalCode(nationalcode);
        System.out.println("Please Enter Password : ");
       // String password = scanner.nextLine();
        users[emptyIndex].setPassWord(password);
        System.out.println(" Your Information saved Successfully");
        emptyIndex++;
        signinPage();
    }

    public void signinPage() {
        System.out.println(" Please Enter Your NatinolCode : ");
        String nationalcode = scanner.nextLine();
        System.out.println(" Please Enter Password : ");
        String password = scanner.nextLine();
        for (int i = 0; i < emptyIndex; i++) {
            if (users[i].getLastName() != null && users[i].getPassWord() != null) {
                if (users[i].getLastName().equals(nationalcode) && users[i].getPassWord().equals(password)) {
                    System.out.println("WelCome To System.");
                    showMenu();
                    break;
                }
            } else
                continue;
        }
        return;
    }

}




