//Sum of 3 digits of a no.
import java.util.*;
class Example2{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int n1 = a%10;
        a/=10;
        int n2 = a%10;
        a/=10;
        int n3 = a%10;
        int res = n1+n2+n3;
        System.out.println(res);
    }
}