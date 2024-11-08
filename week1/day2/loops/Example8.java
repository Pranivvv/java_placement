//sum of even no. till 20
import java.util.*;
class Example8{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a no.");
        int n = sc.nextInt();
        int res = 0;
        for(int i=0; i<=n; i++){
            if(i%2 == 0){
                res += i;
            }
        }
        System.out.println(res);
    }
}