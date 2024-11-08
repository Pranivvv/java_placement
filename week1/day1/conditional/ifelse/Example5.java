//if char is voval
import java.util.*;
class Example5{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter charactar");
        char ch = sc.next().charAt(0);
        if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
            System.out.println("voval");
        }
        else{
            System.out.println("not voval");
        }
    }
}