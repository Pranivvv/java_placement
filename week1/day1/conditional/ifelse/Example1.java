//find max no.
import java.util.*;
class Example1{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter 5 nos.");
        int no1 = sc.nextInt();
        int no2 = sc.nextInt();
        int no3 = sc.nextInt();
        int no4 = sc.nextInt();
        int no5 = sc.nextInt();
        int max = no1;
        if(max < no2){
            max = no2;
        }
        if(max < no3){
            max = no3;
        }
        if(max < no4){
            max = no4;
        }
        if(max < no5){
            max = no5;
        }
        System.out.println(max);
    }
}