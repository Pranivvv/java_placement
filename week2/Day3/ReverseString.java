import java.util.Scanner;

public class ReverseString {
static Scanner sc = new Scanner(System.in);
char stacks[] = new char[5] ;  // Declare a Stack of size  5
int top = -1;
    public char pop(){
            return(stacks[top--]);
        }

    public void push(char pushed_char){
            top++;
            stacks[top]=pushed_char;
    }

    public static void main(String[] args) {
        ReverseString p = new ReverseString();
        System.out.println("Enter sting to be reversed");
        String str = sc.next();
        int x = str.length();

        for (int i = 0; i < x; i++) {
            char m = str.charAt(i);
            p.push(m);
        }

        System.out.println("Reversed string is: ");
        for (int i = 0; i < x; i++) {
            System.out.print(p.pop());
        }
        System.out.println();
    }
}