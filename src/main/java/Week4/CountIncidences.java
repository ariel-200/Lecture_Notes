package Week4;

import java.util.ArrayList;
import java.util.List;

import static input.InputUtils.positiveDoubleInput;

public class CountIncidences {
    public static void main(String[] args) {

        List<Double> speeds = new ArrayList<>();

        int totalHours = 12; // Define total hours

        // Loop for the user to input speeds for each hour
        for (int hour = 0; hour < totalHours; hour++) {
            double speed = positiveDoubleInput("Enter the internet speed for hour " + hour);
            speeds.add(speed);
        }

        System.out.println("All the speeds are:");

        // Loop to Print the speeds each hour
        for (int hour = 0; hour < speeds.size(); hour++) {
            double speed = speeds.get(hour);
            System.out.printf("Hour: %d  Speed: %.2f\n", hour, speed);
        }

        // Count the number of times the speed was 0

        int zeroCount = 0;

        // Add 1 to the counter each time the speed is 0
        for (double speed : speeds) {
            if (speed == 0) {
                zeroCount++;
            }
        }

        System.out.println("Number of times speed was 0 (no connection) : " + zeroCount); // Print the results.

        // Remove all zeros
        while (speeds.contains(0.0)) {
            speeds.remove(0.0);
        }

        System.out.println(speeds);

        // Find the average speed
        double total = 0;
        for (double speed : speeds) {
            total += speed; // Find the total
        }

        double average = total / speeds.size();
        System.out.println("The average speed is " + average);

    }
}
