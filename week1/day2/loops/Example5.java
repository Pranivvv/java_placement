//find if entered no is armstrong or not.(only for 3 digit no)
import java.util.*;
class Example5{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a no.");
        int n1 = sc.nextInt();
        int original = n1;
        int res = 0;
        while (n1>0){
            int temp = n1%10;
            n1/=10;
            res+=temp*temp*temp;
        }
        System.out.println(res);
        if(res == original){
            System.out.println("no is armstrong");
        }
        else{
            System.out.println("no is not armstrong");
        }
        
    }
}