package Week6;

import java.io.*;

public class HelloWriting {
    public static void main(String[] args) {

        // File will be created if it does not exist
        // File will be overwritten if it does exist
        // BufferedWriter wraps the FileWriter and handles I/O in the background
        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("hello.txt"))) {

            // Use the BufferedWriter to write Strings to the file.
            bufferedWriter.write("Hello!");
            bufferedWriter.newLine(); // adds a new line
            bufferedWriter.write("More data here\n");
            bufferedWriter.write("Goodbye!\n");


        } catch (IOException e) {
            System.out.println("Error writing to file " + e);
        }
        try(BufferedWriter bufferedWriter2 = new BufferedWriter(new FileWriter("hello.txt", true))){ //append flag - true means add data to the end

            bufferedWriter2.write("Other data here\n");
            bufferedWriter2.write("Hello Programmers\n");
            bufferedWriter2.write("End of File\n");


        } catch (IOException e) {
            System.out.println("Error appending to file " + e);
        }
    }
}
