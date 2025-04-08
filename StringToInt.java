package Week6;


public class StringToInt {
    public static void main(String[] args) {

        String hopeIsNumber = "50";

        try {
            int number = Integer.parseInt(hopeIsNumber);
            System.out.println("The number is " + number);

            // Exception Handling
        } catch (NumberFormatException e) {
            System.out.println(hopeIsNumber + " is not a valid number");
        }

        System.out.println("This is the end of the program");

    }
}
