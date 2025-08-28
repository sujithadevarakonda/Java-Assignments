package phase3;

public class NestedTryDemo {
    public static void main(String[] args) {
        try {
            System.out.println("Outer try block started...");

            // First risky operation
            int[] arr = {10, 20, 30};

            try {
                System.out.println("Inner try block started...");
                int result = 10 / 0;  // ArithmeticException
                System.out.println("Result: " + result);
            } catch (ArithmeticException e) {
                System.out.println("Inner catch: Division by zero is not allowed.");
            }

            // This will cause ArrayIndexOutOfBoundsException
            System.out.println("Accessing 5th element: " + arr[5]);

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Outer catch: Array index is out of bounds.");
        }

        System.out.println("Program continues after handling exceptions...");
    }
}
