package Week2;

import java.util.Arrays;

import static input.InputUtils.stringInput;

public class Textbooks {
    public static void main(String[] args) {

        // Create Array to store 5 Strings
        String[] textbooks = new String[5];

        for (int number = 0; number < textbooks.length; number++) {
            // Get data about one book from the user
            String bookName = stringInput("Please enter the name of the textbook");
            // Using the loop counter to write each array element in turn
            textbooks[number] = bookName;

        }

        System.out.println("Thank you: here is the data you entered");
        System.out.println(Arrays.toString(textbooks));

    }
}
