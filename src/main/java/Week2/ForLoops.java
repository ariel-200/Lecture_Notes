package Week2;

public class ForLoops {
    public static void main(String[] args) {


        // print number 1-5
        for (int x = 1; x <= 5; x++ ) {
            System.out.println(x);
        }

        // Blank line
        System.out.println();

        // Print 10, 9, 8... 0
        for (int x = 10; x >= 0; x--){
            System.out.println(x + "...");
        }

        // Blank line
        System.out.println();

        // Oil Change
        int mileage = 150000;
        int interval = 3000;

        for (int miles = mileage; miles < (mileage + 8 * interval); miles+=interval) {
            System.out.println("Get an oi; change at " + miles + " miles.");
        }

    }
}
