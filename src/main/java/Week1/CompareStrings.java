package Week1;

import static input.InputUtils.stringInput;

public class CompareStrings{
    public static void main(String[] args) {

        String college = stringInput("What college do you go to?");

        if (college.equalsIgnoreCase("MCTC")) {
            System.out.println("Yay, good choice!!");
        } else {
            System.out.println("Too, bad, you should check out MCTC.");
        }

    }
}
