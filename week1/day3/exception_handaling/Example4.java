import java.util.*;

class InvalidUsernamePassword extends Exception{
    public InvalidUsernamePassword(String str){
        System.out.println(str);
    }
}

class Example4{
    static void Check(String username,String password) throws InvalidUsernamePassword{
        if(username.equals("admin")){
            if(password.equals("123456")){
                System.out.println("Username amd Password is correct");
            }
            else{
                throw new InvalidUsernamePassword("Password is not correct");
            }
        }
        else{
            throw new InvalidUsernamePassword("Username is not correct");
        }
    }
    public static void main(String args[]) throws InvalidUsernamePassword{
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Username : ");
        String username = sc.next();
        System.out.println("Enter Password : ");
        String password = sc.next();
        Example4.Check(username,password);
    }
}