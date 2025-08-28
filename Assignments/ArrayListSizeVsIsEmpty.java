package phase3;

import java.util.ArrayList;

public class ArrayListSizeVsIsEmpty {
    public static void main(String[] args) {
        // Create an empty ArrayList of Strings
        ArrayList<String> list = new ArrayList<>();

        // Initially the list is empty
        System.out.println("Initial size: " + list.size());   // 0
        System.out.println("Is list empty? " + list.isEmpty()); // true

        // Add some elements
        list.add("Apple");
        list.add("Banana");
        list.add("Cherry");

        // After adding elements
        System.out.println("\nAfter adding elements:");
        System.out.println("Current size: " + list.size());   // 3
        System.out.println("Is list empty? " + list.isEmpty()); // false

        // Remove all elements
        list.clear();

        // After clearing the list
        System.out.println("\nAfter clearing elements:");
        System.out.println("Final size: " + list.size());   // 0
        System.out.println("Is list empty? " + list.isEmpty()); // true
    }
}

