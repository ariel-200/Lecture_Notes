package Week0;

public class PizzaRolls {
    public static void main(String[] args) {

        // Sharing pizza rolls fairly between people

        double pizzaRolls = 40; // Number of pizza rolls in a packet
        int people = 7;

        double rollsPerPerson = pizzaRolls / people;

        System.out.println("Each person gets  " + rollsPerPerson + " pizza rolls.");
        System.out.printf("Each person gets %.1f pizza rolls%n", rollsPerPerson);
}
}
