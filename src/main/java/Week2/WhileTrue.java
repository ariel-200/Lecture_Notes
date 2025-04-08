package Week2;

import static input.InputUtils.stringInput;

public class WhileTrue {
    public static void main(String[] args) {

        String password = "kittens";
        String userPassword = stringInput("Enter the password");

        int maxGuess = 5;

        // This loop will repeat while the password is NOT "kittens"
        while ( ! userPassword.equals(password) && maxGuess > 1 ) {
            System.out.println("Password incorrect, access denied");
            System.out.println("Try again");
            userPassword = stringInput("Enter the password");
            maxGuess--;

        }

        if ( maxGuess > 1 ) {
            System.out.println("Correct password, access granted");
        } else {
            System.out.println("Max number of attempts reached, access denied");

            /*
            Break - ends the loop/ breaks out of the loop
            Continue - skips the rest of the iteration, the loop will continue with the next
            iteration if the condition for more iterations is still true
             */
        }

    }


}
