package phase3;

import java.util.LinkedList;

public class LinkedListRemoveExample {
    public static void main(String[] args) {
        // Create a LinkedList of Strings
        LinkedList<String> names = new LinkedList<>();

        // Add elements
        names.add("Alice");
        names.add("Bob");
        names.add("Charlie");
        names.add("David");
        names.add("Eve");

        System.out.println("Original LinkedList: " + names);

        // Remove the first element
        names.removeFirst();

        // Remove the last element
        names.removeLast();

        System.out.println("After removing first and last elements: " + names);
    }
}

