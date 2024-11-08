import java.util.Scanner;

public class Example2 {
    public int fact(int n){
        if(n==0){
            return 1;
        }
        else{
            return n*fact(n-1);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Example2 e = new Example2();
        int n = sc.nextInt();//145;
        int original = n;
        int res = 0;
        while(n>0){
            int x = e.fact(n%10);

            n/=10;
            res += x;
        }
        if(original == res){
            System.out.println("strong no");
        }
        else{
            System.out.println("not strong no");
        }
    }
}
