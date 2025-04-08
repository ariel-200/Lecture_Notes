package Week7;

public class Tire implements Comparable<Tire> {

    private String name;
    private double price;
    private int warranty;

    public Tire(String tireName, double tirePrice, int tireWarranty) {
        name = tireName;
        price = tirePrice;
        warranty = tireWarranty;
    }

    // Method to calculate price per 1000 miles
    public double pricePerMiles(){
        return (price / warranty) * 1000;
    }

    // Method to calculate cost of 4 tires
    public double costSet(){
        return price * 4;
    }

    // Method for String Description
    @Override
    public String toString() {
        return String.format("%s costs $%.2f per tire. Cost per 1000 miles is $%.2f.", name, price, pricePerMiles());
    }

    // Method to Compare Tires
    @Override
    public int compareTo(Tire otherTire){
        return Double.compare(pricePerMiles(), otherTire.pricePerMiles());
    }
}
