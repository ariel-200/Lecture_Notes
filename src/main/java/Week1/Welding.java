package Week1;

import static input.InputUtils.yesNoInput;

public class Welding {
    public static void main(String[] args) {

        // When taking Welding classes aat MCTC, you must dress safely.
        // You should wear cotton or wool clothes. And, you should wear closed-toe shoes.

        // This program checks if a student is dressed safely for welding

        boolean cottonClothes = yesNoInput("Are you wearing cotton clothes?");
        boolean woolClothes = yesNoInput("Are you wearing wool clothes?");
        boolean closeToeShoes = yesNoInput("Are you wearing closed-toe shoes?");

        // TODO - write an if-statement to check if the student is dressed safely

        if ( (cottonClothes || woolClothes) && closeToeShoes) {
            System.out.println("You are dressed safely for welding.");
        } else {
            System.out.println("You are not dressed safely for welding.");
        }
    }
}
