package javafundamentals;

public class compoundmodulo {
        public static void main(String[] args) {
            int x = 17;
            int y = 5;

            x += y;
            System.out.println("After addition: " + x);


            x *= 2;
            System.out.println("After multiplication: " + x);

            int remainder = x % y;
            System.out.println("Remainder: " + remainder);
        }
    }