package ASS;

import java.util.Scanner;

public class SumEvenOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int sumEven = 0;
        int sumOdd = 0;

        System.out.println("Enter 5 integers:");
        for (int i = 0; i < 5; i++) {
            int num = sc.nextInt();

            if (num % 2 == 0) {
                sumEven += num;
            } else {
                sumOdd += num;
            }
        }

        System.out.println("Sum of Even numbers: " + sumEven);
        System.out.println("Sum of Odd numbers: " + sumOdd);

        sc.close();
    }
}


