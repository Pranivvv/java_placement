//multiplication of digits of entered no.
import java.util.*;
class Example3{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a no.");
        int n1 = sc.nextInt();
        int res = 1;
        while (n1>0){
            res *= n1%10 ;
            n1/=10;
        }
        System.out.println(res);
    }
}