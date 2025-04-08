package Week2;

import java.util.Random;

import static input.InputUtils.intInput;

public class secretNumber {
    public static void main(String[] args) {


        //Create a Random object - this is a random number generator object
        Random random = new Random();
       int randomNumber = random.nextInt(10) + 1 ; // Creates a random number between 1 and 10
       int guess = intInput("Guess the secret number, 1-10. ");

       while (randomNumber != guess) {
           System.out.println("Your guess was incorrect, please try again.");

           if (guess < randomNumber) {
               System.out.println("Guess a higher number.");
           } else {
               System.out.println("Guess a lower number.");
           }
           guess = intInput("Guess the secret number, 1-10. ");

       }

        System.out.println("You are correct!!");

    }
}
