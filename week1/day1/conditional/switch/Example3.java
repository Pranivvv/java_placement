// accpt a amount and find the no of notes required for a given amount of money
import java.util.*;
class Example3{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter amount");
        int amount = sc.nextInt();
        int res=0;
        switch(amount){
            case 2000 : 
                    res += amount/2000;
                    amount %= 2000;
            case 500 : 
                    res += amount/500;
                    amount %= 500;
            case 200 : 
                    res += amount/200;
                    amount %= 200;
            case 100 : 
                    res += amount/100;
                    amount %= 100;
            case 50 : 
                    res += amount/50;
                    amount %= 50;
            case 10 : 
                    res += amount/10;
                    amount %= 10;
            case 5 : 
                    res += amount/5;
                    amount %= 5;
            case 2 : 
                    res += amount/2;
                    amount %= 2;
            case 1 : 
                    res += amount/1;
                    amount %= 1;
        }
        System.out.println(res);
    }
}