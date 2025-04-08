package Week3;

import static input.InputUtils.*;

public class Tires {
    public static void main(String[] args) {

        // Get number of tires to loop
        int numberOfTires = positiveIntInput("Enter number of tires");

        // Create Array to store Tire Report Data
        String[] tireReports = new String[numberOfTires];

        // Loop to save all tire reports in the array
        for (int t = 0; t < numberOfTires; t++) {
            String report = getTireInfo();
            tireReports[t] = report;

        }

        // Print Tire Report
        printReportTable(tireReports);

    }


    private static void printReportTable(String[] tireReports) {
        for (int t = 0; t < tireReports.length; t++) {
            System.out.println(tireReports[t]);

        }
    }


    public static String getTireInfo(){

        // Get Inputs from the user
        String tireName = stringInput("Enter name of tire");
        double price = doubleInput("Enter price for " + tireName);
        double miles = doubleInput("Enter warranty miles for " + tireName);
        double pricePerThouMiles = price / miles * 1000;

        // return Tire Info
        return ("The " + tireName + " tire costs $" + pricePerThouMiles + " per thousand miles.");

    }
}
