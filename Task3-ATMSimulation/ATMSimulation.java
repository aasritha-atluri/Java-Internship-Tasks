import java.util.Scanner;

public class ATMSimulation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double balance = 0.0;  // Start with 0 balance
        int choice;

        do {
            System.out.println("\n--- ATM Menu ---");
            System.out.println("1. Check Balance");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Exit");
            System.out.print("Choose: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Balance: $" + balance);
                    break;
                case 2:
                    System.out.print("Enter deposit amount: ");
                    double dep = sc.nextDouble();
                    if (dep >= 0) {
                        balance += dep;
                        System.out.println("Deposited: $" + dep);
                    } else {
                        System.out.println("Invalid amount!");
                    }
                    break;
                case 3:
                    System.out.print("Enter withdrawal amount: ");
                    double wit = sc.nextDouble();
                    if (wit >= 0 && wit <= balance) {
                        balance -= wit;
                        System.out.println("Withdrew: $" + wit);
                    } else {
                        System.out.println("Insufficient funds or invalid amount!");
                    }
                    break;
                case 4:
                    System.out.println("Thank you! Exiting...");
                    break;
                default:
                    System.out.println("Invalid option!");
            }
        } while (choice != 4);

        sc.close();
    }
}
