import java.util.Scanner;

public class LabReadinessChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Student Name: ");
        String student = sc.nextLine();

        System.out.print("Enter Laboratory Name: ");
        String lab = sc.nextLine();

        System.out.println("\nJAVA LAB READINESS CHECK");
        System.out.println("Student Name: " + student);
        System.out.println("Laboratory: " + lab);
        System.out.println("Status: Java environment is ready.");
        System.out.println("Compile: javac LabReadinessChecker.java");
        System.out.println("Run: java LabReadinessChecker");
    }
}