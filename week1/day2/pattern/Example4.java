//1 2 3 4
// 5 6 7 8
// 9 10 11 12
// 13 14 15 16
import java.util.*;
class Example4{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a no.");
        int n = sc.nextInt();
        int x=1;
        for(int i=1;i<=n;i++){
            for(int j=0;j<n;j++){
                System.out.print(x+" ");
                x++;
            }
            System.out.println("");
        }
    }
}