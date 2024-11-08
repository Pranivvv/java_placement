import java.util.Scanner;

public class Example2 {
    int n,bad,s=0;
    boolean Api(int ver){
        boolean bol=false;
        if(ver == bad ){
            bol = true;
        }
        return bol;
    }
    public static void main(String[] args) {
        Example2 e = new Example2();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of version");
        e.n = sc.nextInt();
        e.bad = sc.nextInt();
        while(e.n>e.s){
            if(e.Api((e.n+e.s)/2)){
                e.s = (e.n+e.s)/2;
                System.out.println(e.s);
            }
            else{
                e.n = (e.n+e.s)/2;
                System.out.println(e.n);
            }
        }
        System.out.println(e.n);
    }
}
