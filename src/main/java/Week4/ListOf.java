package Week4;


import java.util.ArrayList;
import java.util.List;

public class ListOf {
    public static void main(String[] args) {

        // Create a non-modifiable list using List.of
        List<String> nonModifiableList = List.of("Cat", "Bird", "Fish");
        // nonModifiableList.add("Giraffe");  // This will error
        // nonModifiableList.remove(0); // This will error too

        System.out.println(nonModifiableList);

    }
}
