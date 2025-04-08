package Week4;

import java.util.ArrayList;
import java.util.List;

import static input.InputUtils.stringInput;

public class toDoList {
    public static void main(String[] args) {

        List<String> todoList = new ArrayList<>(); // Create to do List


        while (true){ // Start the loop
            String task = stringInput("Please type a task you need to do, or press Enter to quit"); // Input tasks from the user

            if (containsIgnoresCase(todoList, task)){ // Call the method
                break; //end the loop
            }

            if (todoList.contains(task)) { // If the task is already in the list...
                System.out.println("This task is already in the list"); //... then print the message...
            } else {
                todoList.add(task); // ...If not then add the task to the List

            }
        }

        System.out.println("Thank you, here are all of your tasks entered:");

        for (String tasks: todoList) {
            System.out.println(tasks); // Print out all tasks

        }

        System.out.println("You have " + todoList.size() + " tasks to do. ");

    }

    // Method to check if a task is already in the list
    public static boolean containsIgnoresCase(List<String> list, String task) {
        for (String item: list) {
            if (item.equalsIgnoreCase(task)) {
                return true;
            }
        }
        return false;
    }
}
