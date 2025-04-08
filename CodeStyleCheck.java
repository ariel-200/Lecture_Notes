package Week6;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class CodeStyleCheck {
    public static void main(String[] args){

        String filename = "ReadNumberFromFile.java";
        int maxLength = 100;

        try (BufferedReader reader = new BufferedReader(new FileReader(filename))){

            String line = reader.readLine();
            int lineCounter = 1;
            boolean TooLong = false;
            int numberLongLines = 0;

            while (line != null){

                // Print the lines if the line isn't too long
                if (line.length() > maxLength){
                    System.out.println("Line " + lineCounter + " is too long");
                    System.out.println(line);
                    TooLong = true;
                    numberLongLines++;

                }
                lineCounter++;
                line = reader.readLine();

            }

            if (TooLong){
                System.out.println("There's " + numberLongLines + " lines that are too long.");
            }else {
                System.out.println("There were no lines that are too long");
            }

        } catch (IOException e){
            System.out.println("Error reading file " + filename + ": " + e);
        }
    }
}
