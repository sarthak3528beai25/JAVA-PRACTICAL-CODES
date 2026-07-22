import java.util.Scanner;

public class TrainingFeedbackSummary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Student Name: ");
        String name = sc.nextLine();

        System.out.print("Content Rating: ");
        int content = sc.nextInt();

        System.out.print("Explanation Rating: ");
        int explanation = sc.nextInt();

        System.out.print("Practical Rating: ");
        int practical = sc.nextInt();

        int total = content + explanation + practical;
        double average = total / 3.0;

        System.out.println("\nTRAINING FEEDBACK");
        System.out.println("Student: " + name);
        System.out.println("Content: " + content + "/5");
        System.out.println("Explanation: " + explanation + "/5");
        System.out.println("Practical Work: " + practical + "/5");
        System.out.printf("Average Rating: %.2f/5\n", average);
    }
}