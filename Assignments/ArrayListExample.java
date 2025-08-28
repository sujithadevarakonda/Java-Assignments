package phase3;

import java.util.ArrayList;

public class ArrayListExample {
    public static void main(String[] args) {
        // Create an ArrayList of Integer type
        ArrayList<Integer> numbers = new ArrayList<>();

        // Add 10 numbers to the ArrayList
        for (int i = 1; i <= 10; i++) {
            numbers.add(i * 10); // Adding 10, 20, 30, ..., 100
        }

        // Print numbers using for-each loop
        System.out.println("Numbers in the ArrayList:");
        for (int num : numbers) {
            System.out.println(num);
        }
    }
}
