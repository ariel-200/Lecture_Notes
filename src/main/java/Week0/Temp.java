package Week0;

public class Temp {
    public static void main(String[] args) {

        // Create Variables
        String currentMonth = "January";
        int dayOfMonth = 11;
        double forecastHigh = 19.4;
        double forecastLow = -3.7;

        // Calculate the difference
        double difference = forecastHigh - forecastLow;

        // Combine data to print
        System.out.printf("On " + currentMonth + " " + dayOfMonth + ", the difference between the high and low temperatures is %.2f", difference);


    }
}
