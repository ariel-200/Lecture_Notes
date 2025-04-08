package Week0;

public class Address {
    public static void main(String[] args) {

        // Create Variables
        String city = "Minneapolis";
        String state = "mn";

        // Combine and uppercase the state
        String cityState = city + ", " + state.toUpperCase();

        // Print
        System.out.println(cityState);

    }
}
