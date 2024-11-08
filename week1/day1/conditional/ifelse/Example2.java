//accept marks of 3 papers and if marks of paper is lessthan 45
//print "fail" else print "pass"
import java.util.*;
class Example2{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter marks of 3 papers");
        int paper1 = sc.nextInt();
        int paper2 = sc.nextInt();
        int paper3 = sc.nextInt();
        int avg = (paper1+paper2+paper3)/3;
        if(paper1 < 45 || paper2 <45 || paper3 <45){
            System.out.println("fail");
        }
        else{
            System.out.println("pass");
        }
    }
}