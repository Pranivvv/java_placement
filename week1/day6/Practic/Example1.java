import java.util.Scanner;

interface Rbi{
    void Intrest();
    
}

abstract class BankAccount {
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

    abstract void deposit(); //{
    //     System.out.println("Enter the amount to be deposited into the account: ");
    //     double amount = sc.nextDouble();
    //     balance += amount;
    // }

    abstract void withdraw(); //{
    //     System.out.println("Enter the amount to be withdrawn from the current account: ");
    //     double amount = sc.nextDouble();
    //     balance -= amount;
    //}
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

    void deposit() {
        System.out.println("Enter the amount to be deposited into the account: ");
        double amount = sc.nextDouble();
        balance += amount;
    }
}

class CurrentAccount extends BankAccount {
    Scanner sc = new Scanner(System.in);

    CurrentAccount(double balance) {
        super(balance);
    }

    void withdraw() {
            System.out.println("Enter the amount to be withdrawn from the current account: ");
            double amount = sc.nextDouble();
            balance -= amount;
        }

    void deposit() {
        System.out.println("Enter the amount to be deposited into the account: ");
        double amount = sc.nextDouble();
        balance += amount;
    }
}

class Intrest2 extends CurrentAccount implements Rbi{
    Intrest2(Double balance){
        super(balance);
    }
    public void Intrest(){
        double intrest = (balance * 2)/100;
        System.out.println("Your intrest is "+ intrest);
    }
}

class Intrest1 extends SavingsAccount implements Rbi{
    Intrest1(Double balance){
        super(balance);
    }
    public void Intrest(){
        double intrest = (balance * 4)/100;
        System.out.println("Your intrest is "+ intrest);
    }
}

class Example1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Intrest2 craccount = new Intrest2(1000.0);
        Intrest1 saccount = new Intrest1(1000.0);
        int choice;
        System.out.println("1 savings a/c");
        System.out.println("2. Current a/c");
        System.out.println("chose account type");
        int actype = sc.nextInt();            
        switch (actype) {
                case 1:
                    while (true) {
                        System.out.println("Enter the operation to be performed: ");
                        System.out.println("1. Input Data.");
                        System.out.println("2. Display.");
                        System.out.println("3. Deposit.");
                        System.out.println("4. Withdraw.");
                        System.out.println("5. View Intrest");
                        System.out.println("6. Exit.");
                        choice = sc.nextInt();

                        switch (choice) {
                            case 1:
                                saccount.inputData();
                                break;

                            case 2:
                                saccount.display();
                                break;

                            case 3:
                                saccount.deposit();
                                break;

                            case 4:
                                saccount.withdraw();
                                break;
                            
                            case 5:
                                saccount.Intrest();
                                break;

                            case 6:
                                System.exit(1);
                                break;
                        }
                    }
                case 2:
                    while (true) {
                        System.out.println("Enter the operation to be performed: ");
                        System.out.println("1. Input Data.");
                        System.out.println("2. Display.");
                        System.out.println("3. Deposit.");
                        System.out.println("4. Withdraw.");
                        System.out.println("5. View Intrest");
                        System.out.println("6. Exit.");
                        choice = sc.nextInt();

                        switch (choice) {
                            case 1:
                                craccount.inputData();
                                break;

                            case 2:
                                craccount.display();
                                break;

                            case 3:
                                craccount.deposit();
                                break;

                            case 4:
                                craccount.withdraw();
                                break;
                            
                            case 5:
                                craccount.Intrest();
                                break;

                            case 6:
                                System.exit(1);
                                break;
                        }
                    }
            }
    }
}

