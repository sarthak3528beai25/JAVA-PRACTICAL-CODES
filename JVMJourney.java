import java.util.Scanner;

public class JVMJourney {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Student Name: ");
        String student = sc.nextLine();

        String s1 = "Java Source Code (.java)";
        String s2 = "Java Compiler (javac)";
        String s3 = "Bytecode (.class)";
        String s4 = "Class Loader";
        String s5 = "JVM Execution Engine";
        String s6 = "Machine Output";

        System.out.println("\nJVM EXECUTION JOURNEY");
        System.out.println("Student: " + student);
        System.out.println("1. " + s1);
        System.out.println("2. " + s2);
        System.out.println("3. " + s3);
        System.out.println("4. " + s4);
        System.out.println("5. " + s5);
        System.out.println("6. " + s6);
    }
}