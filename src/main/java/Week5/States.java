package Week5;

import java.util.HashMap;
import java.util.Map;

public class States {
    public static void main(String[] args) {

        Map<String, String> stateAbbreviations = new HashMap<>();
        stateAbbreviations.put("Minnesota", "MN");
        stateAbbreviations.put("Wisconsin", "WI");
        stateAbbreviations.put("Michigan", "MI");

        System.out.println(stateAbbreviations); // Prints the HashMap


        System.out.println(stateAbbreviations.get("Minnesota")); // Prints the Abbr. for Minnesota
        System.out.println(stateAbbreviations.get("Iowa")); // Prints null

        String wisconsinAbbr = stateAbbreviations.get("Wisconsin"); // Stores Wisconsin Abrr. in a new variable
        System.out.println(wisconsinAbbr); // prints "WI"

        stateAbbreviations.put("Iowa", "IA"); // add Iowa
        System.out.println(stateAbbreviations.get("Iowa")); // Prints "IA"


        String searchAbbr = "MI"; // Create a variable to search for an Abbr.

        // Loop over the Hashmap keys
        for (String stateName : stateAbbreviations.keySet()) {
            System.out.println(stateName); // Prints all the state names on a separate line
            String abbr = stateAbbreviations.get(stateName); // Create variable to for the Abbr.
            if (abbr.equals(searchAbbr)) { // If the search value is in the map...
                System.out.println("Found it! The state for " + searchAbbr + " is " + stateName); //... print the message
            }
        }


        // Create a new map to reverse the keys and values
        Map<String, String> abbreviationsStateNames = new HashMap<>();

        // Loops over key-value pairs
        // Loop to add the data from the old map into the new map but reversed
        for (Map.Entry<String, String> entry : stateAbbreviations.entrySet()) {
            String state = entry.getKey();
            String abbr = entry.getValue();
            abbreviationsStateNames.put(abbr, state);
        }

        // Print both maps.
        System.out.println(stateAbbreviations);
        System.out.println(abbreviationsStateNames);

        System.out.println("There are " + stateAbbreviations.size() + " states with abbreviations.");

    }
}
