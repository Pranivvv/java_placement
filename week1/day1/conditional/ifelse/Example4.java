//if day is weekday or weekend
import java.util.*;
class Example4{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter day");
        String day = sc.next();
        if(day.equals("sun") || day.equals("sat")){
            System.out.println("weekend");
        }
        else{
            System.out.println("weekday");
        }
    }
}