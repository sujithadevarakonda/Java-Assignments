package javafundamentals;

public class relationalandlogicalope {
        public static void main(String[] args) {
            int age = 20;
            int score = 75;
            int passMark = 50;

            boolean passed = score >= passMark;
            System.out.println("Did the student pass? " + passed);

            boolean isAdultAndPassed = (age >= 18) && passed;
            System.out.println("Is the student an adult and passed? " + isAdultAndPassed);
        }
    }
