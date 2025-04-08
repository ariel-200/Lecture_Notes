package Week3;

import static input.InputUtils.intInput;

public class Count {
    public static void main(String[] args) {

        // print a list of numbers in order
        int smallNumber = intInput("Enter a small number ");
        int largeNumber = intInput("Enter a large number ");

        System.out.println("I will count from " + smallNumber + " to " + largeNumber);

        count(smallNumber, largeNumber);

    }

    // methods that don't return anything - return type is void
    public static void count(int min, int max) {
        for (int x = min; x <= max; x++) {
            System.out.println(x);

        }
    }
}
