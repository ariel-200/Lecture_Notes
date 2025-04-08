package Week3;

import static input.InputUtils.doubleInput;

public class MPG {
    public static void main(String[] args) {

        // Get inputs for gas and miles
        double miles = doubleInput("Enter number of miles driven: ");
        double gas = doubleInput("Enter gallons of gas used: ");

        // Call and print the calculateMPG method
        double mpg = calculateMPG(miles, gas);
        System.out.println("The MPG for this journey is " + mpg + " miles per gallon");

    }

    // Method to calculate and return MPG (miles / gas)
    public static double calculateMPG(double miles, double gas) {
        return miles / gas;

    }

}
