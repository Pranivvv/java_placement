//compare two arrays
import java.util.*;
class Example3{
    public static void main(String args[]){
        int marks1[]={1,2,3};
        int marks2[]={4,5,6};
        int marks3[]={1,2,3};
        System.out.println(Arrays.equals(marks1,marks2));
        System.out.println(Arrays.equals(marks1,marks3));
    }
}