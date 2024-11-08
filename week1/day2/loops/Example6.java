//if non is palindrome ot not
import java.util.*;
class Example6{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a no.");
        int n1 = sc.nextInt();
        int original = n1;
        int res = 0;
        while (n1>0){
            int temp = n1%10;
            n1/=10;
            res = res*10 + temp;
        }
        System.out.println(res);
        if(res == original){
            System.out.println("no is palindrome");
        }
        else{
            System.out.println("no is not palindrome");
        }
        
    }
}