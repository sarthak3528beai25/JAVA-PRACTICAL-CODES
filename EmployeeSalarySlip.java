import java.util.Scanner;

public class EmployeeSalarySlip {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Basic Salary: ");
        double basic = sc.nextDouble();

        double hra = basic * 20 / 100;
        double da = basic * 10 / 100;
        double pf = basic * 12 / 100;
        double gross = basic + hra + da;
        double net = gross - pf;

        System.out.println("\nSALARY SLIP");
        System.out.printf("Basic Salary: Rs. %.2f\n", basic);
        System.out.printf("HRA (20%%): Rs. %.2f\n", hra);
        System.out.printf("DA (10%%): Rs. %.2f\n", da);
        System.out.printf("PF (12%%): Rs. %.2f\n", pf);
        System.out.printf("Gross Salary: Rs. %.2f\n", gross);
        System.out.printf("Net Salary: Rs. %.2f\n", net);
    }
}