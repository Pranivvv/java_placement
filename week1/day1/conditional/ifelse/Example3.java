//accept marks of 3 papers, if percentage >=82 and gender = female
//print "you can take addmision " else print "you cannot take addmision"
//or if percentage >=62 and gender = male Print "you can take addmision" 
//else print "you cannot take addmision"
import java.util.*;
class Example3{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter marks of 3 papers and gender");
        int paper1 = sc.nextInt();
        int paper2 = sc.nextInt();
        int paper3 = sc.nextInt();
        int percentage = (paper1+paper2+paper3)/3;
        char gender = sc.next().charAt(0);
        if(((percentage >=82) && (gender == 'f')) ||  ((percentage >=62) && (gender == 'm'))){
            System.out.println("you can take addmision");
        }
        else{
            System.out.println("you cannot take addmision");
        }
    }
}