package HW3;

import java.util.Scanner;

public class Course {
    private Integer[] courseCode;
    private String[] nameCourse;
    private Integer emptyIndex;
    private Scanner scanner = new Scanner(System.in);

    public Course(Integer[] courseCode, String[] nameCourse) {
        this.emptyIndex = 0;
        this.courseCode = courseCode;
        this.nameCourse = nameCourse;
        courseCode = new Integer[100];
        nameCourse = new String[1000];
    }

    public Integer[] getCourseCode() {
        return courseCode;
    }

    public void setCourseCode(Integer[] courseCode) {
        this.courseCode = courseCode;
    }

    public String[] getNameCourse() {
        return nameCourse;
    }

    public void setNameCourse(String[] nameCourse) {
        this.nameCourse = nameCourse;
    }

    public void registrationCourse() {
        System.out.println("Please Enter Name Course : ");
        String namecourse = scanner.nextLine();
        this.setNameCourse(nameCourse);
        System.out.println("Please Enter Code Course : ");
        String codecourse = scanner.nextLine();
        this.setCourseCode(courseCode);
        System.out.println("registrationCourse successfuly");
        emptyIndex++;
    }


}
