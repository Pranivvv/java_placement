import java.util.*;

class InvalidAgeException extends Exception{
    public InvalidAgeException(String str){
        System.out.println(str);
    }
}

class Example3{
    static void Status(int age) throws InvalidAgeException{
        if(age>18){
            System.out.println("Eligible to marry");
        }
        else{
            throw new InvalidAgeException("not able to marry till age 18");
        }
    }
    public static void main(String args[]) throws InvalidAgeException{
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter age");
        int age = sc.nextInt();
        Example3.Status(age);
    }
}