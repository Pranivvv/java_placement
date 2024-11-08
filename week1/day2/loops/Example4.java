//factorial of entered no.
import java.util.*;
class Example45{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a no.");
        int n1 = sc.nextInt();
        int res = 1;
        while (n1>0){
            res *= n1 ;
            n1--;
        }
        System.out.println(res);
    }
}