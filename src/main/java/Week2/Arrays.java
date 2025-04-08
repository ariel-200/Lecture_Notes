package Week2;

public class Arrays {
    public static void main(String[] args) {


        // Example int Array
        int[] numbers = new int[5];
        numbers[0] = 4;
        numbers[1] = 100;
    //    numbers[5] = 3;

        // Example String Array
        String[] classNames = {"Java", "C#", "Web", "Android", "iOS"};
    //    classNames[0] = "Java";
    //    classNames[1] = "C#";
    //    classNames[2] = "Web";

        System.out.println("One of the second year classes is " + classNames[1]);

        int numberOfClasses = classNames.length;
        System.out.println("There are " + numberOfClasses + " classes in the array.");

        for (int x = 0; x < numberOfClasses; x++) {
            System.out.println("A class name is " + classNames[x]);
        }

        System.out.println(java.util.Arrays.toString(classNames));

    }
}
