import java.util.*;
class Example1{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        try{
            int a = sc.nextInt();
            int res = n/a;
            System.out.println(res);
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}