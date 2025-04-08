package Week3;

public class StringFormatting {
    public static void main(String[] args) {

        String college = "MCTC";
        String className = "Java Programming";
        int classCode = 2545;
        int credits = 6;
        double averageGrade = 84.545345;
        boolean isOnline = true;

        // %d = int
        // %s = String / anything else (boolean)
        // %f = double
        // to include a percent character use it twice %%
        System.out.printf("This class is %d %s. It is taught at %s. It is %d credits, the average " +
                "grade is %.2f%%. Is it online? %s.\n", classCode, className, college, credits, averageGrade, isOnline);

        System.out.printf("The average grade is %.3f", averageGrade);

    }
}
