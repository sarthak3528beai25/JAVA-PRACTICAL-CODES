class Employee {

    static int nextId = 1001;

    int employeeId;
    String employeeName;

    Employee(String employeeName) {
        this.employeeName = employeeName;
        employeeId = nextId++;
    }

    void display() {
        System.out.println("Employee ID   : " + employeeId);
        System.out.println("Employee Name : " + employeeName);
        System.out.println();
    }
}

public class CompanyEmployeeIDGenerator {
    public static void main(String[] args) {

        Employee e1 = new Employee("Amit");
        Employee e2 = new Employee("Neha");
        Employee e3 = new Employee("Rohit");

        e1.display();
        e2.display();
        e3.display();
    }
}