package Week6;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class WritingNumbers {
    public static void main(String[] args) throws IOException {

        int data1 = 67;
        int data2 = 65;
        int data3 = 84;

//        double number = 12.34;

        FileWriter writer = new FileWriter("numbers.txt");
        BufferedWriter bufWriter = new BufferedWriter(writer);


        bufWriter.write(data1 + "\n"); //
        bufWriter.write(data2 + "\n");
        bufWriter.write(data3 + "\n");

//        bufWriter.write(number + "\n");

        //Always close files when you are done working with them
        bufWriter.close();

    }
}
