package javafundamentals;

public class MultiplesOfThree {
        public static void main(String[] args) {
            System.out.print("Multiples of 3 between 1 and 20: ");
            for (int i = 1; i <= 20; i++) {
                if (i % 3 == 0) {
                    System.out.print(i + " ");
                }
            }
        }
    }

