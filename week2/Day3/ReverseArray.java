import java.util.Scanner;

public class ReverseArray {
    static Scanner sc = new Scanner(System.in);
    int stacks[] = new int[5] ;  // Declare a Stack of size  5
    int top = -1;
    public int pop(){
            return(stacks[top--]);
        }

    public void push(int pushed_char){
            stacks[++top]=pushed_char;
    }

    public static void main(String[] args) {
        ReverseArray p = new ReverseArray();
        System.out.println("Enter array to be reversed");
        int arr[]= new int[5];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int x = 5;

        for (int i = 0; i < x; i++) {
            int m = arr[i];
            p.push(m);
        }

        System.out.println("Reversed array is: ");
        for (int i = 0; i < x; i++) {
            System.out.print(p.pop()+ " ");
        }
        System.out.println();
    }
}