//1
//22
//333
//4444
import java.util.*;
class Example2{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a no.");
        int n = sc.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=0;j<i;j++){
                System.out.print(i+" ");
            }
            System.out.println("");
        }
    }
}