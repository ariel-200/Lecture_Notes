package Week4;

import java.util.ArrayList;
import java.util.List;

public class Removing {
    public static void main(String[] args) {

        List<String> classNames = new ArrayList<>();
        classNames.add("Programming Logic");
        classNames.add("Web Client Server");
        classNames.add("Project Management");
        classNames.add("Info Tech Concepts");

        // Loop over the List
        for (String name : classNames) {
            System.out.println(name);
        }

        System.out.println(classNames); // Print the List

        classNames.remove("Project Management"); // Remove "Project Management" from the List
        System.out.println(classNames);

        boolean wasRemoved = classNames.remove("Project Management"); // Boolean to tell if an element was removed or not
        System.out.println(classNames + " " + wasRemoved); // Print the list and the boolean

        classNames.remove(0); // Remove the first element from the List
        System.out.println(classNames);

        classNames.set(0, "Systems Analysis"); // changes the first element to "System Analysis"
        System.out.println(classNames);

        // If-Else statement to print the results if a String is or isn't in the list
        String search = "Systems Analysis";
        if (classNames.contains(search)) {
            System.out.println("The list contains " + search);
        } else {
            System.out.println("The list does not contain " + search);
        }

        classNames.clear(); // Clears everything from the list
        System.out.println(classNames);
        System.out.println(classNames.size()); // Prints the size of the list
        System.out.println(classNames.isEmpty()); // Prints true or false if the list is or isn't empty

    }
}
