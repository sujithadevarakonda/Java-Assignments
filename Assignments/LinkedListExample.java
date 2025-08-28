package phase3;

import java.util.LinkedList;

public class LinkedListExample {
    public static void main(String[] args) {
        // Create a LinkedList of String type
        LinkedList<String> names = new LinkedList<>();

        // Add 5 names
        names.add("Alice");
        names.add("Bob");
        names.add("Charlie");
        names.add("David");
        names.add("Eve");

        // Retrieve the 3rd element (index 2 because indexing starts from 0)
        String thirdName = names.get(2);

        // Print the 3rd element
        System.out.println("The 3rd name in the LinkedList is: " + thirdName);
    }
}

