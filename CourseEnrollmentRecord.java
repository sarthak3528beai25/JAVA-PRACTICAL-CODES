class Enrollment {
    String enrollmentId;
    String learnerName;
    String courseName;
    double fee;
    String paymentStatus;

    // Complete Constructor
    Enrollment(String id, String learner, String course,
               double fee, String status) {
        enrollmentId = id;
        learnerName = learner;
        courseName = course;
        this.fee = fee;
        paymentStatus = status;
    }

    // Constructor Chaining
    Enrollment(String id, String learner, String course,
               double fee) {
        this(id, learner, course, fee, "Pending");
    }

    void display() {
        System.out.println("\nENROLLMENT RECORD");
        System.out.println("Enrollment ID : " + enrollmentId);
        System.out.println("Learner Name  : " + learnerName);
        System.out.println("Course Name   : " + courseName);
        System.out.println("Fee           : Rs. " + fee);
        System.out.println("Payment Status: " + paymentStatus);
    }
}

public class CourseEnrollmentRecord {
    public static void main(String[] args) {

        Enrollment e1 = new Enrollment(
                "E101",
                "Aman",
                "Java Programming",
                12000);

        Enrollment e2 = new Enrollment(
                "E102",
                "Riya",
                "Python",
                10000,
                "Paid");

        e1.display();
        e2.display();
    }
}