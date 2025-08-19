package javafundamentals;
import java.util.Scanner;


public class MenuDrivenCalculator {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int choice;
            double num1, num2, result;

            while(true) {  // Infinite loop until user chooses to exit
                // Display menu
                System.out.println("\nMenu:");
                System.out.println("1. Add");
                System.out.println("2. Subtract");
                System.out.println("3. Multiply");
                System.out.println("4. Divide");
                System.out.println("5. Exit");
                System.out.print("Enter your choice (1-5): ");
                choice = scanner.nextInt();

                if(choice == 5) {
                    System.out.println("Exiting calculator. Goodbye!");
                    break;  // Exit the loop
                }

                if(choice < 1 || choice > 5) {
                    System.out.println("Invalid choice! Please try again.");
                    continue;  // Skip the rest and show menu again
                }

                System.out.print("Enter two numbers: ");
                num1 = scanner.nextDouble();
                num2 = scanner.nextDouble();

                // Perform operation based on user's choice
                switch(choice) {
                    case 1:
                        result = num1 + num2;
                        System.out.printf("Result: %.2f + %.2f = %.2f%n", num1, num2, result);
                        break;
                    case 2:
                        result = num1 - num2;
                        System.out.printf("Result: %.2f - %.2f = %.2f%n", num1, num2, result);
                        break;
                    case 3:
                        result = num1 * num2;
                        System.out.printf("Result: %.2f * %.2f = %.2f%n", num1, num2, result);
                        break;
                    case 4:
                        if(num2 != 0) {
                            result = num1 / num2;
                            System.out.printf("Result: %.2f / %.2f = %.2f%n", num1, num2, result);
                        } else {
                            System.out.println("Error: Division by zero!");
                        }
                        break;
                }
            }
            scanner.close();
        }
    }
