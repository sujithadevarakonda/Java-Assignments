package javafundamentals;

public class TypeCasting {
    public static void main(String[] args) {
        int a=9;
        double b=4.0;
        double c=a+b;
        double d=a/b;
        boolean e=a>(int)b;
        boolean f=(a % 3==0) && (b> 2.5);



        System.out.println("a+b=" + c );
        System.out.println("a/b=" + d);
        System.out.println("a>(int)b="+ e );
        System.out.println("a/b=" + f );
    }
}
