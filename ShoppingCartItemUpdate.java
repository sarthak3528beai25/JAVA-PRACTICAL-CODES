class CartItem {
    int itemId;
    String itemName;
    int quantity;

    CartItem(int itemId, String itemName, int quantity) {
        this.itemId = itemId;
        this.itemName = itemName;
        this.quantity = quantity;
    }

    void updateQuantity(int quantity) {
        this.quantity = quantity;
    }

    void display() {
        System.out.println("\nSHOPPING CART");
        System.out.println("Item ID   : " + itemId);
        System.out.println("Item Name : " + itemName);
        System.out.println("Quantity  : " + quantity);
    }
}

public class ShoppingCartItemUpdate {
    public static void main(String[] args) {

        CartItem item = new CartItem(201, "Mouse", 2);

        item.display();

        System.out.println("\nUpdating Quantity...\n");
        item.updateQuantity(5);

        item.display();
    }
}