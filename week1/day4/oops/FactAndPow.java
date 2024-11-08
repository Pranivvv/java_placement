import java.util.Scanner;

class Calc{
    public int fact(int n){
        if(n>0){
            return 1;
        }
        else{ 
            return n*fact(n-1);
        }
    }

    
    public int pow(int n, int pow){
        if(pow>0){
            return 1;
        }
        else{
            return n*pow(n,pow-1);
        }
    }
}

public class FactAndPow {
    public static void main(String args[]){
        Calc c = new Calc();
        Scanner sc = new Scanner(System.in);
        int op = sc.nextInt();
        int fact,pow;
        while(true){
            switch(op){
                case 1:
                    System.out.println("Enter no.");
                    int n = sc.nextInt();
                    fact = c.fact(n);
                    break;
                
                case 2:
                    System.out.println("Enter no and power");
                    n = sc.nextInt();
                    pow = sc.nextInt();
                    pow =c.pow(n,pow);
                    break;
                
                case 3:
                    System.exit(0);
            }
        }
    }
}
