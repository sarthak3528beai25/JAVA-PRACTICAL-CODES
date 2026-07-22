import java.util.Scanner;

public class CafeteriaReceiptGenerator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Item Name: ");
        String item = sc.nextLine();

        System.out.print("Enter Unit Price: ");
        double price = sc.nextDouble();

        System.out.print("Enter Quantity: ");
        int quantity = sc.nextInt();

        System.out.print("Enter GST Rate: ");
        double gstRate = sc.nextDouble();

        double subtotal = price * quantity;
        double gst = subtotal * gstRate / 100;
        double total = subtotal + gst;

        System.out.println("\nCAFETERIA RECEIPT");
        System.out.println("----------------------------");
        System.out.println("Item: " + item);
        System.out.printf("Subtotal: Rs. %.2f\n", subtotal);
        System.out.printf("GST: Rs. %.2f\n", gst);
        System.out.printf("Grand Total: Rs. %.2f\n", total);
    }
}