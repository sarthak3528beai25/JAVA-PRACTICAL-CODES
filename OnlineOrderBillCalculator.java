import java.util.Scanner;

public class OnlineOrderBillCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Item Price: ");
        double price = sc.nextDouble();

        System.out.print("Enter Quantity: ");
        int quantity = sc.nextInt();

        System.out.print("Enter Delivery Charge: ");
        double delivery = sc.nextDouble();

        System.out.print("Enter Discount Percentage: ");
        double discountPercent = sc.nextDouble();

        double subtotal = price * quantity;
        double discount = subtotal * discountPercent / 100;
        double finalAmount = subtotal - discount + delivery;

        System.out.println("\nORDER BILL");
        System.out.printf("Subtotal: Rs. %.2f\n", subtotal);
        System.out.printf("Discount: Rs. %.2f\n", discount);
        System.out.printf("Delivery Charge: Rs. %.2f\n", delivery);
        System.out.printf("Final Payable Amount: Rs. %.2f\n", finalAmount);
    }
}