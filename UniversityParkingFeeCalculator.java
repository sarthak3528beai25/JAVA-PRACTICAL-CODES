import java.util.Scanner;

public class UniversityParkingFeeCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("1. Two Wheeler");
        System.out.println("2. Car");

        System.out.print("Enter Vehicle Type: ");
        int type = sc.nextInt();

        System.out.print("Enter Parking Hours: ");
        int hours = sc.nextInt();

        if (hours < 1 || hours > 12) {
            System.out.println("Invalid Hours");
            return;
        }

        int fee = 0;

        switch (type) {
            case 1:
                fee = (hours == 1) ? 10 : 10 + (hours - 1) * 5;
                System.out.println("Vehicle: Two Wheeler");
                break;

            case 2:
                fee = (hours == 1) ? 20 : 20 + (hours - 1) * 10;
                System.out.println("Vehicle: Car");
                break;

            default:
                System.out.println("Invalid Vehicle Type");
                return;
        }

        System.out.println("Hours: " + hours);
        System.out.println("Fee: Rs. " + fee);
    }
}