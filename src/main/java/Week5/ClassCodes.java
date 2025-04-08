package Week5;

import java.util.HashMap;
import java.util.Map;

public class ClassCodes {
    public static void main(String[] args) {

        // Create Hashmap and add data
        Map<Integer, String> classes = new HashMap<>();
        classes.put(2545, "Java Programming");
        classes.put(1375, "Database Design");
        classes.put(2560, "Web Client Server");

        // Loop the prints all the class codes and names
        for (Map.Entry<Integer, String> entry : classes.entrySet()) {
            System.out.println("ITEC " + entry.getKey() + " " + entry.getValue());
        }

        // Print the number of classes I am taking
        System.out.println("The number of classes is " + classes.size());

        // Search Variables
        int searchCode = 2417;
        int searchCode2 = 2545;

        // Check if searchCode is in the map
        if (classes.containsKey(searchCode)) {
            System.out.println("The class name for " + searchCode + " is " + classes.get(searchCode));
        } else {
            System.out.println("Class " + searchCode + " not found.");
        }

        // Check if searchCode2 is in the map
        if (classes.containsKey(searchCode2)) {
            System.out.println("The class name for " + searchCode2 + " is " + classes.get(searchCode2));
        } else {
            System.out.println("Class " + searchCode2 + " not found.");
        }





    }
}
