package Week7.Dates;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ClassList {

    public static void main(String[] args) {

        List<Student> students = new ArrayList<>();
        Student s1 = new Student("A");
        students.add(s1);
        Student s2 = new Student("B");
        students.add(s2);

        for (Student s : students) {
            System.out.println(s.name + " registered at " + s.registrationDay);
        }



    }
}
