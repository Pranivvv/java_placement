import java.util.*;
class Example10{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter n and x");
        int n = sc.nextInt();
        double res = 1;
        int x = sc.nextInt();
        for(double i=1; i<=n; i++){
            res += ((double) Math.pow(x,i))/i;
        }
        System.out.println(res);
    }
}