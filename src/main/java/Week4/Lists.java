package Week4;

import java.util.ArrayList;
import java.util.List;

public class Lists {
    public static void main(String[] args) {

        List<String> arrayList = new ArrayList<>();
        arrayList.add("Hello");
        arrayList.add("World");
        arrayList.add("Ariel"); // add your name to the list
        arrayList.add("MCTC"); // add MCTC to the List

        arrayList.remove("Ariel"); // Remove by value
        arrayList.remove(0); // Remove String at index 0, the first element

        // Loop to print everything in the list
        for (String s: arrayList) {
            System.out.println(s);
            System.out.println(s.toUpperCase()); // Print the list in uppercase
            System.out.println(s.length()); // Print the length of the String

        }

    }
}
