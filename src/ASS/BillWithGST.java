package ASS;
    import java.util.Scanner;

    public class BillWithGST {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            System.out.print("Enter cost of Pencil: ");
            float pencil = sc.nextFloat();

            System.out.print("Enter cost of Pen: ");
            float pen = sc.nextFloat();

            System.out.print("Enter cost of Eraser: ");
            float eraser = sc.nextFloat();

            float total = pencil + pen + eraser;

            float totalWithGST = total + (total * 18 / 100);

            System.out.println("\n----- BILL -----");
            System.out.println("Pencil: " + pencil);
            System.out.println("Pen   : " + pen);
            System.out.println("Eraser: " + eraser);
            System.out.println("Total (without GST): " + total);
            System.out.println("Total (with 18% GST): " + totalWithGST);

            sc.close();
        }
    }

