//find if entered no is armstrong or not.(for any no of digit)
import java.util.*;
class Example7{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a no.");
        int n1 = sc.nextInt();
        int original = n1;
        int res = 0;
        int pow=0;
        while (n1>0){
            pow ++;
            n1/=10;
        }
        n1=original;
        int rem;
        while(n1>0){    
            rem = n1%10;
            int temp = rem;
            for(int i=1;i<pow; i++){
                rem = rem * temp;
            }
            n1/=10;
            res += rem;
        }

        if(res == original){
            System.out.println("no is armstrong");
        }
        else{
            System.out.println("no is not armstrong");
        }
        
    }
}