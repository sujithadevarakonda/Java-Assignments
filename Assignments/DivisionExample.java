package phase3;

public class DivisionExample {
    public static void main(String[] args) {
        int numerator = 10;
        int denominator = 0;  // This will cause division by zero

        try {
            int result = numerator / denominator;  // Risky operation
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Error: Division by zero is not allowed.");
        }

        System.out.println("Program continues after handling the exception...");
    }
}
