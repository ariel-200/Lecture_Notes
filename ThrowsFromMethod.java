package Week6;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ThrowsFromMethod {
    public static void main(String[] args) {

        String filename = "does_not_exist.txt";

        try {
            List<String> data = readFromFile(filename);
            System.out.println(data);
        } catch (FileNotFoundException fnfe) {
            System.out.println("The file " + filename + " was not found. Fix and try again.");
        } catch (IOException ioe) {
            System.out.println("Could not read from file " + filename);
        }
    }

// Method to read file
    private static List<String> readFromFile(String filename) throws IOException {
        BufferedReader buffReader = new BufferedReader(new FileReader(filename));
        List<String> lines = new ArrayList<>();
        String line = buffReader.readLine();
        while (line != null) {
            lines.add(line);
            line = buffReader.readLine();
        }

        buffReader.close();
        return lines;
    }
}
