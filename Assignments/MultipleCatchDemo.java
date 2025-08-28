package phase3;

public class MultipleCatchDemo {
    public static void main(String[] args) {
        try {
            String str = null; // This may cause NullPointerException

            // Uncomment one at a time to see different exceptions
            // int result = 10 / 0;          // ArithmeticException
            int length = str.length();       // NullPointerException
            // int[] arr = new int[3];
            // System.out.println(arr[5]);   // ArrayIndexOutOfBoundsException (will go to Exception block)

            System.out.println("Operation successful!");
        }
        catch (ArithmeticException e) {
            System.out.println("Error: Division by zero is not allowed.");
        }
        catch (NullPointerException e) {
            System.out.println("Error: You tried to use a null object.");
        }
        catch (Exception e) {
            System.out.println("Error: Some other exception occurred - " + e);
        }

        System.out.println("Program continues after handling the exception...");
    }
}

