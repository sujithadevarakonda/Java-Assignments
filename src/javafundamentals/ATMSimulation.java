package javafundamentals;
import java.util.Scanner;

public class ATMSimulation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        final int PIN = 1234;  // predefined 4-digit PIN
        int balance = 10000;   // initial balance
        int userPin;

        // Step 1: Ask for a 4-digit PIN
        System.out.print("Enter your 4-digit PIN: ");
        userPin = scanner.nextInt();

        // Step 2: If PIN is correct, show menu
        if (userPin == PIN) {
            int choice;
            do {
                // Display Menu
                System.out.println("\n=== ATM MENU ===");
                System.out.println("1. Check Balance");
                System.out.println("2. Deposit Money");
                System.out.println("3. Withdraw Money");
                System.out.println("4. Exit");
                System.out.print("Enter your choice: ");
                choice = scanner.nextInt();

                switch (choice) {
                    case 1:
                        // Check Balance
                        System.out.println("Your current balance is: ₹" + balance);
                        break;

                    case 2:
                        // Deposit Money
                        System.out.print("Enter amount to deposit: ₹");
                        int deposit = scanner.nextInt();
                        if (deposit > 0) {
                            balance += deposit;
                            System.out.println("₹" + deposit + " deposited successfully.");
                        } else {
                            System.out.println("Invalid deposit amount.");
                        }
                        break;

                    case 3:
                        // Withdraw Money
                        System.out.print("Enter amount to withdraw: ₹");
                        int withdraw = scanner.nextInt();
                        if (withdraw > 0 && withdraw <= balance) {
                            balance -= withdraw;
                            System.out.println("₹" + withdraw + " withdrawn successfully.");
                        } else if (withdraw > balance) {
                            System.out.println("Insufficient funds.");
                        } else {
                            System.out.println("Invalid withdrawal amount.");
                        }
                        break;

                    case 4:
                        // Exit
                        System.out.println("Thank you for using the ATM. Goodbye!");
                        break;

                    default:
                        System.out.println("Invalid option. Please try again.");
                }

            } while (choice != 4); // Step 3: Repeat until Exit
        } else {
            System.out.println("Incorrect PIN. Access Denied.");
        }

        scanner.close();
    }
}
