package phase3;

import java.util.ArrayList;

public class ArrayListContainsExample {
    public static void main(String[] args) {
        // Create an ArrayList of Strings
        ArrayList<String> fruits = new ArrayList<>();

        // Add some elements
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Cherry");
        fruits.add("Mango");
        fruits.add("Orange");

        // Check if "Mango" exists
        String search1 = "Mango";
        if (fruits.contains(search1)) {
            System.out.println(search1 + " exists in the ArrayList.");
        } else {
            System.out.println(search1 + " does not exist in the ArrayList.");
        }

        // Check if "Grapes" exists
        String search2 = "Grapes";
        if (fruits.contains(search2)) {
            System.out.println(search2 + " exists in the ArrayList.");
        } else {
            System.out.println(search2 + " does not exist in the ArrayList.");
        }
    }
}

