package Week5;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static input.InputUtils.positiveIntInput;

public class RoadTrip {
    public static void main(String[] args) {

        // Create Map and add data
        Map<String, Integer> distances = new HashMap<>();
        distances.put("Duluth", 154);
        distances.put("Brainerd", 127);
        distances.put("Stillwater", 26);
        distances.put("Ely", 245);
        distances.put("Red Wing", 54);

        // Ask the user for the max distance
        int maxDistance = positiveIntInput("Enter the maximum distance you want to drive.");

        // Create a List for the names of the cities in range
        List<String> citiesInRange = new ArrayList<>();


        for (String cities : distances.keySet()) { //Loop over city names in map
            int distance = distances.get(cities); // Create variable for distances
            if (distance <= maxDistance) {
//              System.out.println(cities + " with a distance of " + distance);
                citiesInRange.add(cities); // add the cities in range to the list
            }
        }

        // Print the cities in range or not found message
        if (citiesInRange.isEmpty()) {
            System.out.println("No cities found within " + maxDistance + " miles.");
        }else {
            System.out.println("The cities you can visit within " + maxDistance + " miles are:");
            for (String cities : citiesInRange) { // Loop over cities in range list
                System.out.println(cities);
            }
        }

    }
}
