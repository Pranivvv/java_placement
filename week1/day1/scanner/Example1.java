//Sum of 2 digits of a no.
import java.util.*;
class Example1{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int n1 = a%10;
        a/=10;
        int n2 = a%10;
        int res = n1+n2;
        System.out.println(res);
    }
}