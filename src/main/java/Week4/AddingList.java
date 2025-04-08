package Week4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class AddingList {
    public static void main(String[] args) {

        List<Integer> classCodes = new ArrayList<>();
        classCodes.add(2545);
        classCodes.add(1150);
        classCodes.add(1250);

        classCodes.add(0, 1425); // Adds 1425 to the first spot
        classCodes.add(2, 1100); // Adds 1100 to the second spot

        System.out.println(classCodes); // Print List
        System.out.println(classCodes.size()); // Prints the size of the List

        classCodes.remove(2); // Removes the element in the second spot
        classCodes.remove(Integer.valueOf(1250)); // Removes the number 1250

        System.out.println(Collections.min(classCodes)); // Prints the smallest number in the List
        System.out.println(Collections.max(classCodes)); // Prints the largest number in the List

        // Print the elements in the List
        for (int classCode : classCodes) {
            System.out.println("ITEC " + classCode);
        }

    }
}
