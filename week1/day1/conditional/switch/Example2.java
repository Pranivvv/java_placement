//ch is vowel or not
import java.util.*;
class Example2{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter char");
        char op = sc.next().charAt(0);
        switch(op){
            case 'a' : 
                    System.out.println("charactor is vowel");
                    break;
            case 'e' : 
                    System.out.println("charactor is vowel");
                    break;
            case 'i' : 
                    System.out.println("charactor is vowel");
                    break;
            case 'o' : 
                    System.out.println("charactor is vowel");
                    break;
            case 'u' : 
                    System.out.println("charactor is vowel");
                    break;
            default:System.out.println("charactor is not vowel");
        }
    }
}