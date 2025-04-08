package Week3;

import java.util.Arrays;

public class ArrayUppercase {
    public static void main(String[] args) {

        String[] animals = {"cat", "dog", "horse", "pig", "rabbit"};
        makeArrayUppercase(animals);
        System.out.println(Arrays.toString(animals));

    }

    public static void makeArrayUppercase(String[] array){
        for (int x = 0; x < array.length; x++){
            array[x] = array[x].toUpperCase();
        }

    }
}
