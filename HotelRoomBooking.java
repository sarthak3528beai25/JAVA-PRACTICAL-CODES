class Room {
    int roomNo;
    String roomType;
    double dailyRate;
    boolean available;

    Room(int roomNo, String roomType, double dailyRate) {
        this.roomNo = roomNo;
        this.roomType = roomType;
        this.dailyRate = dailyRate;
        available = true;
    }

    void bookRoom(int days) {
        if (available) {
            available = false;
            double amount = dailyRate * days;

            System.out.println("\nBOOKING DETAILS");
            System.out.println("Room Number : " + roomNo);
            System.out.println("Room Type   : " + roomType);
            System.out.println("Stay Days   : " + days);
            System.out.println("Total Amount: Rs. " + amount);
            System.out.println("Status      : Booked");
        } else {
            System.out.println("Room is already booked.");
        }
    }
}

public class HotelRoomBooking {
    public static void main(String[] args) {

        Room r1 = new Room(305, "Deluxe", 2500);

        r1.bookRoom(3);
    }
}