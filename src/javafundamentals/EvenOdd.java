package javafundamentals;

public class EvenOdd {
        public static void main(String[] args) {
            int num = 6;

            switch (num % 2) {
                case 0:
                    System.out.println("Even Number");
                    break;
                case 1:
                    System.out.println("Odd Number");
                    break;
                default:
                    System.out.println("Invalid Input");
            }
        }
    }
