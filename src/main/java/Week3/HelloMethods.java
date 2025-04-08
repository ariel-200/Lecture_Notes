package Week3;

import static input.InputUtils.stringInput;

public class HelloMethods {
    public static void main(String[] args) {

        String name = stringInput("Please enter your name.");
        String greeting = makeGreeting(name);
        System.out.println(greeting);

    } // This is the main method.

    // A new Method, this method takes one argument, a String.
    // It will create a new String made from the word "Hello"
    // plus the String argument, plus an exclamation point !
    // It will then return the new greeting String.
    public static String makeGreeting(String n) {

        String greeting = "Hello " + n + "!";
        return greeting;

    }  // The end of the makeGreeting method

}  // End of HelloMethods class
