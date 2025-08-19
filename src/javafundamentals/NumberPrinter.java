package javafundamentals;

public class NumberPrinter {

        public static void main(String[] args) {
            System.out.print("For Loop: ");
            for (int i = 1; i <= 5; i++) {
                System.out.print(i + " ");
            }
            System.out.println();

            System.out.print("While Loop: ");
            int j = 1;
            while (j <= 5) {
                System.out.print(j + " ");
                j++;
            }
            System.out.println();

            System.out.print("Do-While Loop: ");
            int k = 1;
            do {
                System.out.print(k + " ");
                k++;
            } while (k <= 5);
            System.out.println();
        }
    }
