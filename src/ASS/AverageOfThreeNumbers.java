package ASS;
import java.util.Scanner;
    public class AverageOfThreeNumbers {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            System.out.print("Enter number A: ");
            int A = sc.nextInt();

            System.out.print("Enter number B: ");
            int B = sc.nextInt();

            System.out.print("Enter number C: ");
            int C = sc.nextInt();

            double average = (A + B + C) / 3.0;

            System.out.println("The average of the three numbers is: " + average);

            sc.close();
        }
    }

