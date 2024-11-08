import java.util.*;
class Example2{
    public static void main(String args[]){
        try{
            int n = Integer.parseInt(args[0]);
            int a = Integer.parseInt(args[1]);
            int res = n/a;
            System.out.println(res);
        }
        catch(ArrayIndexOutOfBoundsException ae){
            System.out.println(ae);
        }
        catch(NumberFormatException fe){
            System.out.println(fe);
        }
        catch(ArithmeticException e){
            System.out.println(e);
        }
        finally{
            System.out.println("this is runnning afert exception");
        }
        System.out.println("this is out of tey catch");
    }
}