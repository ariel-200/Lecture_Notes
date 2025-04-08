package Week6;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class WriteArrayList {
    public static void main(String[] args) throws IOException {

        List<String> classNames = List.of("Java", "Web", "C#");
        List<Integer> classCodes = List.of(2545, 2560, 2505);

        String filename = "ITEC_Classes.txt";

        BufferedWriter bufWriter = new BufferedWriter(new FileWriter(filename));

        // Loop over the lists
        for (int i = 0 ; i < classNames.size() ; i++) {
            String name = classNames.get(i);
            int code = classCodes.get(i);
            bufWriter.write(String.format("ITEC %d %s \n", code, name));

        }

        bufWriter.close();


        BufferedReader bufReader = new BufferedReader(new FileReader(filename));

        List<String> classes = new ArrayList<>();

        String line = bufReader.readLine();

        while (line != null) {
            classes.add(line);
            line = bufReader.readLine();

        }

        System.out.println("End of file reached");
        System.out.println(classes);

    }
}
