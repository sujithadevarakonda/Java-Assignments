package javafundamentals;

public class typecasting1 {
    public static void main(String[] args) {
        double x = 22.7;
        int y = 4;

        int intX = (int)x;
        int modResult = intX % y;


        double resultAddition = x + (double)y;


        boolean isEqual = intX == (y * 5);


        boolean conditionCheck = x > 20 && y < 10;

        System.out.println("(int)x % y: " + modResult);
        System.out.println("x + (double)y: " + resultAddition);
        System.out.println("Is (int)x equal to y * 5? " + isEqual);
        System.out.println("Is x > 20 and y < 10? " + conditionCheck);
    }
}

  