import java.util.Scanner;

class BankAccount {
    Scanner sc = new Scanner(System.in);
    int c_accno;
    String c_name;
    String c_city;
    double balance;

    BankAccount(double balance) {
        this.balance = balance;
    }

    void inputData() {
        System.out.println("Enter the customer account number, name, city and balance: ");
        c_accno = sc.nextInt();
        c_name = sc.next();
        c_city = sc.next();
        balance = sc.nextDouble();
    }

    void display() {
        System.out.println("The customer details are as follows: ");
        System.out.println("Account Number: " + c_accno);
        System.out.println("Name: " + c_name);
        System.out.println("City: " + c_city);
        System.out.println("Balance: " + balance);
    }

    void deposit() {
        System.out.println("Enter the amount to be deposited into the account: ");
        double amount = sc.nextDouble();
        balance += amount;
    }

    void withdraw() {
        System.out.println("Enter the amount to be withdrawn from the current account: ");
        double amount = sc.nextDouble();
        balance -= amount;
    }
}

class SavingsAccount extends BankAccount {
    Scanner sc = new Scanner(System.in);

    SavingsAccount(double balance) {
        super(balance);
    }

    void withdraw() {
        System.out.println("Enter the amount to be withdrawn from the current account: ");
        double amount = sc.nextDouble();

        if ((balance - amount) <= 1000) {
            System.out.println("Cannot withdraw money, withdrawing will result in balance less than minimum balance.");
        } else {
            balance -= amount;
        }
    }
}

class Example2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SavingsAccount account = new SavingsAccount(1000);
        int choice;
        while (true) {
            System.out.println("Enter the operation to be performed: ");
            System.out.println("1. Input Data.");
            System.out.println("2. Display.");
            System.out.println("3. Deposit.");
            System.out.println("4. Withdraw.");
            System.out.println("5. Exit.");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    account.inputData();
                    break;

                case 2:
                    account.display();
                    break;

                case 3:
                    account.deposit();
                    break;

                case 4:
                    account.withdraw();
                    break;

                case 5:
                    System.exit(1);
                    break;
            }
        }
    }
}
