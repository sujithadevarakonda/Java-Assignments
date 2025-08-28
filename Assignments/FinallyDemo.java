package phase3;

public class FinallyDemo {
    public static void main(String[] args) {
        // Case 1: Exception occurs
        try {
            System.out.println("Case 1: Division by zero");
            int result = 10 / 0;   // ArithmeticException
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Catch Block: Exception caught -> " + e);
        } finally {
            System.out.println("Finally Block: This always executes (Case 1).\n");
        }

        // Case 2: No exception
        try {
            System.out.println("Case 2: Normal division");
            int result = 10 / 2;   // No exception
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Catch Block: Exception caught -> " + e);
        } finally {
            System.out.println("Finally Block: This always executes (Case 2).\n");
        }
    }
}
