//print fibonacci series
import java.util.*;
class Example9{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a no.");
        int n1 = sc.nextInt();
        int res = 0;
        int a=0;
        int b=1;
        System.out.print(a+ " ");
        System.out.print(b+ " ");
        for(int i=0; i<n1-2; i++){
            res = a+b;
            a=b;
            b=res;
            System.out.print(res + " ");
        }
        
    }
}