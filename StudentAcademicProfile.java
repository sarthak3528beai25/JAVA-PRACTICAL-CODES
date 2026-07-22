import java.util.Scanner;

class Student {
    int rollNo;
    String name;
    double marks;
    double attendance;

    void readData(Scanner sc) {
        System.out.print("Enter Roll Number: ");
        rollNo = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Name: ");
        name = sc.nextLine();

        System.out.print("Enter Marks: ");
        marks = sc.nextDouble();

        System.out.print("Enter Attendance (%): ");
        attendance = sc.nextDouble();
    }

    void calculateResult() {
        if (marks >= 40)
            System.out.println("Result: PASS");
        else
            System.out.println("Result: FAIL");
    }

    void displayProfile() {
        System.out.println("\nStudent Profile");
        System.out.println("Roll No: " + rollNo);
        System.out.println("Name: " + name);
        System.out.println("Marks: " + marks);
        System.out.println("Attendance: " + attendance + "%");
        calculateResult();
    }
}

public class StudentAcademicProfile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Student s1 = new Student();
        Student s2 = new Student();
        Student s3 = new Student();

        System.out.println("Enter Details of Student 1");
        s1.readData(sc);

        System.out.println("\nEnter Details of Student 2");
        s2.readData(sc);

        System.out.println("\nEnter Details of Student 3");
        s3.readData(sc);

        s1.displayProfile();
        s2.displayProfile();
        s3.displayProfile();

        sc.close();
    }
}