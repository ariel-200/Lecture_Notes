package Week7;


import java.util.ArrayList;
import java.util.List;

public class ITECCourse {

    // data - fields - instance variables
    private String name;
    private int code;
    private List<String> students;
    private int maxStudents;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public int getMaxStudents() {
        return maxStudents;
    }

    public void setMaxStudents(int maxStudents) {
        if (maxStudents < 0){
            return;
        }
        this.maxStudents = maxStudents;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // Constructor
    // has to have the same name as the object
    public ITECCourse(String courseName, int courseCode, int courseMaxStudents) {
        name = courseName;
        code = courseCode;
        maxStudents = courseMaxStudents;
        students = new ArrayList<>();
    }

    // Add Students Method
    public void addStudent(String studentName){
        if (students.size() == maxStudents) {
            System.out.println("Course is full, cant add " + studentName);
        } else {
            students.add(studentName);
        }
    }

    // Print Course Info Method
    public void writeCourseInfo (){
        System.out.println(); // Blank Line
        System.out.println("Course Name: " + name);
        System.out.println("Course Code: " + code);
        System.out.println("Students Enrolled:");
        for (String s : students){
            System.out.println(s);
        }
        System.out.println("There are " + getNumStudents() + " students enrolled in this course.");
        System.out.println("The max number of students that can enroll in this course is " + maxStudents);
        System.out.println(); // Blank Line

    }

    // Return number of students Method
    public int getNumStudents(){
        return students.size();
    }

    // Remove student by name Method
    public void removeStudent(String studentName){
        if (students.contains(studentName)){
            students.remove(studentName);
            System.out.println(studentName + " has been removed from " + name + ".");
        } else {
            System.out.println(studentName + " was not found in " + name + ".");
        }
    }

}
