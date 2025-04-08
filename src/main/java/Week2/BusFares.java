package Week2;

import static input.InputUtils.doubleInput;

public class BusFares {
    public static void main(String[] args) {

        // An array with the names of each day of the week
        String[] dayNames = {"Monday", "Tuesday", "Wednesday","Thursday", "Friday", "Saturday", "Sunday"};

        double total = 0; // Will add each day's expenses to this variable

        for (int day = 0; day < dayNames.length; day++) {
            String dayName  = dayNames[day];
            double expense = doubleInput("On " + dayName + ", what did you spend on bus fares?");
            total += expense;

        }
        System.out.printf("Total bus fares for the week: $%.2f", total);
    }
}
