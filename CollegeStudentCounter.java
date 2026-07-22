class Student {
    static int totalStudents = 0;

    int rollNo;
    String name;

    Student(int rollNo, String name) {
        this.rollNo = rollNo;
        this.name = name;
        totalStudents++;
    }

    void display() {
        System.out.println("Roll No : " + rollNo);
        System.out.println("Name    : " + name);
        System.out.println();
    }

    static void showTotalStudents() {
        System.out.println("Total Students = " + totalStudents);
    }
}

public class CollegeStudentCounter {
    public static void main(String[] args) {

        Student s1 = new Student(101, "Aman");
        Student s2 = new Student(102, "Riya");
        Student s3 = new Student(103, "Rahul");

        s1.display();
        s2.display();
        s3.display();

        Student.showTotalStudents();
    }
}