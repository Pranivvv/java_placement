// A B C D
// E F G H 
// I J K L
// M N O P
import java.util.*;
class Example7{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a no.");
        int n = sc.nextInt();
        char x='A';
        for(int i=1;i<=n;i++){
            for(int j=0;j<n;j++){
                System.out.print(x+" ");
                x++;
            }
            System.out.println("");
        }
    }
}