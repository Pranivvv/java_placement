//reverse of number
import java.util.*;
class Example4{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int n1 = a%10;
        a/=10;
        int n2 = a%10;
        a/=10;
        int n3 = a%10;
        a/=10;
        int n4 = a%10;
        int res = n4 + n3*10 + n2*100 + n1*1000;
        System.out.println(res);
    }
}