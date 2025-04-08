package Week7;

public class ITECCourseManager {
    public static void main(String[] args) {

        // Create Maintenance Course
        ITECCourse maintenanceCourse = new ITECCourse("Microcomputer Systems Maintenance",1310, 20 );

        // Add Maintenance Students
        maintenanceCourse.addStudent("Anna");
        maintenanceCourse.addStudent("Bill");
        maintenanceCourse.addStudent("Carl");

        maintenanceCourse.removeStudent("Carl");
        maintenanceCourse.removeStudent("Martha");

        // Print Maintenance Course Info
        maintenanceCourse.writeCourseInfo();

        // Create Data Com Course
        ITECCourse dataComCourse = new ITECCourse("Data Communications", 1425, 30);

        // Add Data Com Students
        dataComCourse.addStudent("Dave");
        dataComCourse.addStudent("Ed");
        dataComCourse.addStudent("Flora");

        // Print Data Com Course Info
        dataComCourse.writeCourseInfo();

        // Create Software Course
        ITECCourse softwareCourse = new ITECCourse("Software Development Projects", 2930, 24);

        // Add Software Students
        softwareCourse.addStudent("Gus");
        softwareCourse.addStudent("Harry");
        softwareCourse.addStudent("Izzy");
        softwareCourse.addStudent("Jake");

        // Print Software Students
        System.out.println("The " + softwareCourse.getName() + " course has " + softwareCourse.getMaxStudents() + " students.");

        // Update Software Max Students
        softwareCourse.setMaxStudents(30);

        // Print Software Course Info
        softwareCourse.writeCourseInfo();

        // Create Small Course
        ITECCourse smallCourse = new ITECCourse("Small Class", 1234, 3);

        // Add Small Course Students
        smallCourse.addStudent("Kirby");
        smallCourse.addStudent("Liam");
        smallCourse.addStudent("Miriam");
        smallCourse.removeStudent("Kirby");
        smallCourse.addStudent("Nita");

        // Print Small Course Info
        smallCourse.writeCourseInfo();

    }
}
