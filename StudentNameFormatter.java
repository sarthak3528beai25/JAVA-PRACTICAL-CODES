import java.util.Scanner;

public class StudentNameFormatter {

    public static String formatName(String name) {
        name = name.trim();
        return Character.toUpperCase(name.charAt(0)) +
                name.substring(1).toLowerCase();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter First Name: ");
        String first = sc.nextLine();

        System.out.print("Enter Middle Name: ");
        String middle = sc.nextLine();

        System.out.print("Enter Last Name: ");
        String last = sc.nextLine();

        first = formatName(first);
        middle = formatName(middle);
        last = formatName(last);

        System.out.println("\nFormatted Name: " + first + " " + middle + " " + last);
        System.out.println("Initial Format: " +
                first.charAt(0) + ". " +
                middle.charAt(0) + ". " +
                last);

        sc.close();
    }
}