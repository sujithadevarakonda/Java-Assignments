package javafundamentals;

public class ArethematicPrecision {
        public static void main(String[] args) {
            double x = 7.0;
            int y = 2;


            double result1 = x / y;
            System.out.println("Division result without casting: " + result1);

            double result2 = (double) 7 / y;
            System.out.println("Division result with casting: " + result2);
        }
    }
