package proyecto2;

import java.util.Scanner;

public class BankApp {

    private BankAccount _account;
    private Scanner _scanner;

    public BankApp(BankAccount account) {
        this._account = account;
        _scanner = new Scanner(System.in);
    }



    public void start() {
        int choice;
        do {
            displayMenu();
            choice =  getUserChoice();
            switch (choice) {
                case 1:
                    handleDeposit();
                    break;
                case 2:
                  handleWithdraw();
                    break;
                case 3:
                    displayBalance();
                    break;
                case 4:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 4);
    }


    private void displayBalance() {
        _account.displayBalance();
    }


    private int getUserChoice() {
        System.out.print("Enter your choice: ");
        return _scanner.nextInt();
    }

    private  void handleDeposit() {
        System.out.print("Enter deposit amount: ");
        double amount = _scanner.nextDouble();
        _account.deposit(amount);
    }
    private void handleWithdraw() {
        System.out.print("Enter withdrawal amount: ");
        double amount = _scanner.nextDouble();
        _account.withdraw(amount);
    }
    private void displayMenu() {
        System.out.println("=== Bank Menu ===");
        System.out.println("1. Deposit");
        System.out.println("2. Withdraw");
        System.out.println("3. Display Balance");
        System.out.println("4. Exit");
        System.out.print("Choose an option: ");
    }


}
