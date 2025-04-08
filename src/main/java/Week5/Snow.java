package Week5;

import java.util.HashMap;
import java.util.Map;

import static input.InputUtils.*;

public class Snow {
    public static void main(String[] args) {

        Map<String, Double> snowfall = new HashMap<>();
        snowfall.put("January", 3.1);
        snowfall.put("February", 10.8);
        snowfall.put("December", 3.1);
        snowfall.put("March", 4.1);
        snowfall.put("April", 0.0);

        System.out.println(snowfall);

        // Add up the snowfall for all months
        double total = 0;
        for (Double snow : snowfall.values()) {
            total += snow;
        }
        System.out.println("The total snow in inches is " + total);

        // For loop to print all data on a separate line
        for (String month : snowfall.keySet()) {
            double snow = snowfall.get(month); // create variable for the inches of snow
            System.out.printf("The snow in %s was %.2f inches.\n", month, snow);
        }

        snowfall.put("February", 12.4);

        System.out.println(snowfall);

        System.out.println("The snow in January is " + snowfall.get("January") + " inches.");

        System.out.println("The snow in July is " + snowfall.get("July") + " inches.");

        // // If statement for If the map contains the key
        if (snowfall.containsKey("July")){
            System.out.println("There was snow in July");
        } else {
            System.out.println("There was no snow in July");
        }

        String newMonth = stringInput("Enter name of month"); // Create a new variable for new month and snow
        Double newSnow = positiveDoubleInput("Enter the amount of snow for " + newMonth + " in inches.");


        Double snow = snowfall.get(newMonth); // Create new variable for old snow data.


        // If statement to ask if the month is already in the map
        if (snow == null) { // If value is not in the map...
            snowfall.put(newMonth, newSnow);
        } else {  // If value is in the map...
            // ask if should overwrite?
            System.out.println("The hashmap already contains that month, " + newMonth + " snow =  " + snow + " inches.");
            boolean overwrite = yesNoInput("Overwrite data for this month?"); // ask the user if they want to overwrite
            if (overwrite) {
                snowfall.put(newMonth, newSnow); // add the info if they want to overwrite
            } else {
                System.out.println("Data was not added."); // Don't add data if not
            }

            System.out.println(snowfall);

        }

    }
}
