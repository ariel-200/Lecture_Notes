package Week6;

import java.io.*;

public class WriteArray {
    public static void main(String[] args) throws IOException {

        String[] months = {"Jan", "Feb", "Mar", "Apr", "May", "Jun"};

        String filename = "months.txt";


        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(filename));

        // Loop to write months to file
        for (String month : months) {
            bufferedWriter.write(month + "\n");

        }

        bufferedWriter.close();
    }
}
