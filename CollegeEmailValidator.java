import java.util.Scanner;

public class CollegeEmailValidator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Email: ");
        String email = sc.nextLine().trim();

        System.out.print("Enter Required Domain (e.g. @chitkara.edu.in): ");
        String domain = sc.nextLine().trim();

        int firstAt = email.indexOf('@');
        int lastAt = email.lastIndexOf('@');

        if (firstAt > 0 && firstAt == lastAt && email.endsWith(domain)) {
            System.out.println("\nEMAIL VALIDATION");
            System.out.println("Email: " + email);
            System.out.println("Status: Valid college email");
        } else {
            System.out.println("\nEMAIL VALIDATION");
            System.out.println("Email: " + email);
            System.out.println("Status: Invalid college email");
        }

        sc.close();
    }
}