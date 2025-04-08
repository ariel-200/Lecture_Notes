package Week0;

public class Prices {
    public static void main(String[] args) {

        String productName = "Twinkies";
        double price = 0.99;
        int quantity = 4;

        double totalPrice = price * quantity;

        System.out.println(quantity + " " + productName + " at $" + price + " each costs a total of $" + totalPrice);

    }
}
