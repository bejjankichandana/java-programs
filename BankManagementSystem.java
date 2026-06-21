
import java.util.Scanner;

public class BankManagementSystem {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String accountHolder;
        double balance = 0;
        int choice;
        double amount;

        System.out.print("Enter Account Holder Name: ");
        accountHolder = sc.nextLine();

        do {
            System.out.println("\n===== BANK MENU =====");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Check Balance");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");

            choice = sc.nextInt();

            if (choice == 1) {
                System.out.print("Enter amount to deposit: ");
                amount = sc.nextDouble();
                balance = balance + amount;
                System.out.println("Amount Deposited Successfully!");
            } else if (choice == 2) {
                System.out.print("Enter amount to withdraw: ");
                amount = sc.nextDouble();

                if (amount <= balance) {
                    balance = balance - amount;
                    System.out.println("Amount Withdrawn Successfully!");
                } else {
                    System.out.println("Insufficient Balance!");
                }
            } else if (choice == 3) {
                System.out.println("Account Holder: " + accountHolder);
                System.out.println("Current Balance: ₹" + balance);
            } else if (choice == 4) {
                System.out.println("Thank You for Banking!");
            } else {
                System.out.println("Invalid Choice!");
            }

        } while (choice != 4);

        sc.close();
    }
}
