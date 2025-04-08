package Week6;

import java.io.*;

public class Name {
    public static void main(String[] args) throws IOException {

        String filename = "name.txt";
        String name = "Ariel";
        String color = "Purple";
        int classCode = 2545;

        // Write to the file
        BufferedWriter bufWriter = new BufferedWriter(new FileWriter(filename));

        bufWriter.write("My name is " + name + ".\n");
        bufWriter.write("My favorite color is " + color + ".\n");
        bufWriter.write("My class code is " + classCode + ".\n");

        bufWriter.close();

        // Read the file.
        BufferedReader bufReader = new BufferedReader(new FileReader(filename));

        String line = bufReader.readLine();

        while (line != null) {
            System.out.println(line);
            line = bufReader.readLine();

        }

        bufReader.close();

    }
}
