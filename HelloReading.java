package Week6;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class HelloReading {
    public static void main(String[] args) {

//        Open the resource as the try block starts
        try (BufferedReader bufReader = new BufferedReader(new FileReader("hello.txt"))){


            String line = bufReader.readLine();

            // Loop to read all the lines in the file
            while (line != null) { // Loop stops when the file ends
                System.out.println(line); // Prints the line
                line = bufReader.readLine(); // Moves to the next line
            }
//      Buffered Writer is automatically closed here

        } catch (IOException e) {
            System.out.println("Sorry, file not found. ");

        }
    }
}
