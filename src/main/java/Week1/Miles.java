package Week1;

import static input.InputUtils.positiveDoubleInput;

public class Miles {
    public static void main(String[] args) {

        double miles = positiveDoubleInput("How many miles from your house to MCTC?");
        double km = miles * 1.6;
        System.out.printf("You live %.2f kilometers from MCTC.", km);

        //new line
        System.out.println();
        // does the user live 10 miles away, more, or less?

        if (miles > 10) {
            System.out.println("You live more than 10 miles away from MCTC.");
        } else if (miles == 10) {
            System.out.println("You live exactly 10 miles away from MCTC.");
        } else {
            System.out.println("You live less than 10 miles away from MCTC.");
        }
    }
}