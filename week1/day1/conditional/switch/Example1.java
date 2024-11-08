// arithmatic operations using switch case
import java.util.*;
class Example1{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter 2 nos. and arathmetic oprator");
        int no1 = sc.nextInt();
        int no2 = sc.nextInt();
        char op = sc.next().charAt(0);
        int res;
        switch(op){
            case '+' : 
                    res = no1+no2;
                    System.out.println(res);
                    break;
            case '-' : 
                    res = no1-no2;
                    System.out.println(res);
                    break;
            case '*' : 
                    res = no1*no2;
                    System.out.println(res);
                    break;
            case '/' : 
                    res = no1/no2;
                    System.out.println(res);
                    break;
            default:System.out.println("unvalid oprator");
        }
    }
}