package Week3;

public class TableFormatting {
    public static void main(String[] args) {

        // Arrays to put in a table
        int[] classCodes = {2545, 2505, 2560};
        String[] classNames = {"Java", "C#", "Web"};
        double[] averageClassSize = {22.34233, 17.42323, 14.234234};

        //Table Template and Heading
        String template = "%-10s%-10s%-10s\n";
        System.out.printf(template, "Code", "Name", "Average Size");
        String tableTemplate = "%-10d%-10s%-10.2f\n";

        for (int c = 0; c < classCodes.length; c++) {
            int code = classCodes[c];
            String name = classNames[c];
            double average = averageClassSize[c];
            System.out.printf(tableTemplate, code, name, average);

        }

    }
}
