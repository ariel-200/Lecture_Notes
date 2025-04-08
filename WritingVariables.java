package Week6;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class WritingVariables {
    public static void main(String[] args) throws IOException {

        // Variables
        int classCode = 2454;
        double averageEnrollment = 22.16;
        String className = "Java Programming";

        // Create new file and open it
        FileWriter writer = new FileWriter("java.txt");
        BufferedWriter bufferedWriter = new BufferedWriter(writer);

        // Write to file
        bufferedWriter.write("The class code is " + classCode + ".\n");
        bufferedWriter.write("The average enrollment is " + averageEnrollment + " students.\n");
        bufferedWriter.write("The class name is " + className + ".\n");

        // Close file
        bufferedWriter.close();

    }
}
