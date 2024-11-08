import java.util.Scanner;

class BankAccount{
    int acNo[] = new int[10];
    String name[] = new String[10];
    int bal[] = new int[10];
    int lastRec=0;
    public void inputData(String cname, int balance){
        acNo[lastRec] = lastRec+1;
        name[lastRec] = cname;
        bal[lastRec] = balance;
        System.out.println("Account created successfully");
        System.out.println("Your A/C no. is "+ acNo[lastRec]);
    }
    public void display(int acno){
        int i=0;
        for(i=0;i<lastRec; i++){
            if(acno == acNo[i]){
                break;
            }
        }
        System.out.println("a/c number = "+ acNo[i]);
        System.out.println("Name = " + name[i]);
        System.out.println("Balance = " + bal[i]);
    }
    public void Deposit(int acno, int amount){
        int i=0;
        for(i=0;i<lastRec; i++){
            if(acno == acNo[i]){
                break;
            }
        }
        bal[i] = bal[i] + amount;
        System.out.println("Deposit Successful");
        System.out.println("Your a/c balance is :" + bal[i]);
    }
    public void withdraw(int acno, int amount){
        int i=0;
        for(i=0;i<lastRec; i++){
            if(acno == acNo[i]){
                break;
            }
        }
        bal[i] = bal[i]-amount;
        System.out.println("Withdraw successful");
        System.out.println("your s/c balance is :" + bal[i]);
    }
}

public class Example3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BankAccount b = new BankAccount();
        int acno,amount,op;
        String name;
        while(true){

            // System.out.println("1 savings a/c");
            // System.out.println("2. Current a/c");
            // System.out.println("chose account type");
            // int actype = sc.nextInt();
            // switch (actype) {
            //     case 1:
                    System.out.println("--------------------------------");
                    System.out.println("1 Create a/c");
                    System.out.println("2. View a/c Details");
                    System.out.println("3. Deposite");
                    System.out.println("Withdraw");
                    System.out.println("Exit");
                    System.out.println("--------------------------------");
                    System.out.println("Enter option to perform");
                    op = sc.nextInt();
                    switch (op) {
                        case 1:
                            System.out.println("Enter Name:");
                            name = sc.next();
                            System.out.println("Enter Amount");
                            amount = sc.nextInt();
                            b.inputData(name, amount);
                            break;
                        
                        case 2:
                            System.out.println("Enter  a/c number");
                            acno = sc.nextInt();
                            b.display(acno);
                            break;
                    
                        case 3:
                            System.out.println("Enter  a/c number");
                            acno = sc.nextInt();
                            System.out.println("Enter Amount");
                            amount = sc.nextInt();
                            b.Deposit(acno, amount);
                            break;
                        
                        case 4:
                            System.out.println("Enter  a/c number");
                            acno = sc.nextInt();
                            System.out.println("Enter Amount");
                            amount = sc.nextInt();
                            b.withdraw(acno, amount);
                            break;
                        
                        case 5:
                            System.exit(0);
                        
                        default:
                            System.out.println("Enter correct option");
                            break; 
                    }              

                // case 2:
                //     System.out.println("--------------------------------");
                //     System.out.println("1 Create a/c");
                //     System.out.println("2. View a/c Details");
                //     System.out.println("3. Deposite");
                //     System.out.println("Withdraw");
                //     System.out.println("Exit");
                //     System.out.println("--------------------------------");
                //     System.out.println("Enter option to perform");
                //     op = sc.nextInt();
                //     switch (op) {
                //         case 1:
                //             System.out.println("Enter Name:");
                //             name = sc.next();
                //             System.out.println("Enter Amount");
                //             amount = sc.nextInt();
                //             b.inputData(name, amount);
                //             break;
                        
                //         case 2:
                //             System.out.println("Enter  a/c number");
                //             acno = sc.nextInt();
                //             b.display(acno);
                //             break;
                    
                //         case 3:
                //             System.out.println("Enter  a/c number");
                //             acno = sc.nextInt();
                //             System.out.println("Enter Amount");
                //             amount = sc.nextInt();
                //             b.Deposit(acno, amount);
                //             break;
                        
                //         case 4:
                //             System.out.println("Enter  a/c number");
                //             acno = sc.nextInt();
                //             System.out.println("Enter Amount");
                //             amount = sc.nextInt();
                //             b.withdraw(acno, amount);
                //             break;
                        
                //         case 5:
                //             System.exit(0);
                        
                //         default:
                //             System.out.println("Enter correct option");
                //             break;
                //     }
                //     break;
            
                // default:
                //     System.out.println("Enter correct option");
                //     break;
            // }
        }
    }
}
 



