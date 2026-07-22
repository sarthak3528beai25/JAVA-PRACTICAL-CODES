class BankAccount {
    int accountNumber;
    String holderName;
    double balance;

    void assignData(int accNo, String name, double bal) {
        accountNumber = accNo;
        holderName = name;
        balance = bal;
    }

    void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposit Successful.");
        }
    }

    void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawal Successful.");
        } else {
            System.out.println("Insufficient Balance.");
        }
    }

    void displayAccount() {
        System.out.println("\nACCOUNT SUMMARY");
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Holder Name: " + holderName);
        System.out.println("Balance: Rs. " + balance);
    }
}

public class BankAccountOperations {
    public static void main(String[] args) {

        BankAccount a1 = new BankAccount();
        BankAccount a2 = new BankAccount();

        a1.assignData(1001, "Riya", 5000);
        a2.assignData(1002, "Amit", 8000);

        a1.deposit(1500);
        a1.withdraw(2000);

        a2.deposit(1000);
        a2.withdraw(3000);

        a1.displayAccount();
        a2.displayAccount();
    }
}