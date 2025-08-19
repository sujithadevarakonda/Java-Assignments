package javafundamentals;

public class BooleanLogicChallenge {
        public static void main(String[] args) {
            boolean isJavaFun = true;
            boolean isChallenging = true;

            boolean funNotChallenging = isJavaFun && !isChallenging;
            System.out.println("Is Java fun but not challenging? " + funNotChallenging);

            boolean eitherTrue = isJavaFun || isChallenging;
            System.out.println("Is either Java fun or challenging? " + eitherTrue);
        }
    }
