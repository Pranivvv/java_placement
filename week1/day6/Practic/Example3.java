import java.util.Scanner;

public class Example3 {
    boolean Power(int n){
        boolean bol = false;
        int i = 0;
        while(Math.pow(i, 4)<=n){
            if(Math.pow(i, 4)==n){
                bol = true;
            }
            i++;
        }
        return bol;
    }
   public static void main(String[] args) {
        Example3 e = new Example3();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number to check");
        int n = sc.nextInt();
        boolean bol = e.Power(n);
        System.out.println(bol);
   } 
}
