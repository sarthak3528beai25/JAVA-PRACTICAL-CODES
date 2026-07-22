class Product {
    int productId;
    String productName;
    double price;
    int quantity;

    Product(int productId, String productName, double price, int quantity) {
        this.productId = productId;
        this.productName = productName;
        this.price = price;
        this.quantity = quantity;
    }

    void displayBill() {
        double total = this.price * this.quantity;

        System.out.println("\nPRODUCT BILL");
        System.out.println("Product ID   : " + this.productId);
        System.out.println("Product Name : " + this.productName);
        System.out.println("Price        : Rs. " + this.price);
        System.out.println("Quantity     : " + this.quantity);
        System.out.println("Total Bill   : Rs. " + total);
    }
}

public class ProductBilling {
    public static void main(String[] args) {

        Product p = new Product(101, "Laptop", 55000, 2);
        p.displayBill();
    }
}