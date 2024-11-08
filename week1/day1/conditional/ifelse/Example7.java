//grade of student baised on percentage
import java.util.*;
class Example7{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter marks of 4 papers");
        int paper1 = sc.nextInt();
        int paper2 = sc.nextInt();
        int paper3 = sc.nextInt();
        int paper4 = sc.nextInt();
        int avg = (paper1+paper2+paper3+paper4)/4;
        if(avg>=90){
            System.out.println("A grade");
        }
        else if(avg>=80 && avg<90){
            System.out.println("B grade");
        }
        else if(avg>=70 && avg<80){
            System.out.println("C grade");
        }
        else if(avg>=60 && avg<70){
            System.out.println("D grade");
        }
        else if(avg>=40 && avg<60){
            System.out.println("E grade");
        }
        else{
            System.out.println("fail");
        }
    }
}