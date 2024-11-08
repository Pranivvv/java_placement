// wap to ask the cost price from user and ask whether the user is student or not
// if user is student and cost price is greater than 500 give discount of 10% else discount will be 5%
// if user is not student nd cost price is greater than 500 then give 8% else discount will be2%

import java.util.*;
class Example8{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter cost price and occupation");
        int cost = sc.nextInt();
        String isStudent = sc.next();
        int np;
        if(isStudent.equals("student")){
            if(cost > 500){
                np = cost - (cost/10);
            }
            else{
                np = cost - (cost*5)/100;
            }
        }
        else{
            if(cost > 500){
                np = cost - (cost*8)/100;
            }
            else{
                np = cost - (cost*2)/100;
            }
        }
        System.out.println(np);
    }
}