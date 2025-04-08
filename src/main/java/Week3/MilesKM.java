package Week3;

import static input.InputUtils.doubleInput;

public class MilesKM {
    public static void main(String[] args) {

        double miles = doubleInput("Enter a number of miles ");
        double km = milesTOKM(miles);
        System.out.println(miles + " miles is equal to " + km + " kilometers.");

    }

//      Method returns a double
    private static double milesTOKM(double miles) {
        return miles * 1.6;

    }


}
