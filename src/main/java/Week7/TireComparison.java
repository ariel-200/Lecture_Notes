package Week7;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static input.InputUtils.*;

public class TireComparison {
    public static void main(String[] args) {

        List<Tire> tireList = new ArrayList<>();

        do {
            Tire tire = getTireInfo();
            tireList.add(tire);
        } while (yesNoInput("More tired to add to compare?"));

        Collections.sort(tireList);
        printReportTable(tireList);

    }

    private static void printReportTable(List<Tire> tireList) {
        for (Tire tire: tireList){
            System.out.println(tire + " Cost for set is $" + tire.costSet());
        }
    }

    private static Tire getTireInfo() {
        String name = stringInput("Enter name of tire.");
        double price = positiveDoubleInput("Enter price of " + name + ".");
        int warranty = positiveIntInput("Enter number of miles warranty");

        return new Tire(name, price, warranty);

    }
}
