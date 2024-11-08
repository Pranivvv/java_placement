import java.util.Scanner;

public class Stacks {
    int stackSize = 5;
    int[] arr = new int[stackSize];
    int top = -1;
    Scanner sc = new Scanner(System.in);
    public boolean isEmpty(){
        if(top==-1){
            System.out.println("Stack is empty");
            return false;
        }
        return true;
    }
    
    public boolean isFull(){
        if(top == stackSize-1){
            System.out.println("Stack is full");
            return true;
        }
        return false;
    }

    public void push(){
        if(!isFull()){
            System.out.println("Enter element to push in stack");
            arr[++top] = sc.nextInt();
        }
    }
    
    public void pop(){
        if(isEmpty()){
            System.out.println("You poped : "+ arr[top--]);
        }
    }
    
    public void peek(){
        if(isEmpty()){
            System.out.println("Element at top is "+arr[top]);
        }
    }
    
    public void traverse(){
        if(isEmpty()){
            for(int i=top; i>=0; i--){
                System.out.println("|  "+arr[i]+"  |");
            }
            System.out.println("-------");
        }
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stacks s = new Stacks();
        
        while (true) {
            System.out.println("Select an option");
            System.out.println("1: Push Element to stack \n2. Pop Element from stack \n3. Peek in Stack \n4. Traverse through the stack \n5. Check if stack is full \n6. Check if stack is empty \n7. Exit"); 
            int x = sc.nextInt();
            switch (x) {
                case 1:
                    s.push();
                    break;
                case 2:
                    s.pop();
                    break;
                case 3:
                    s.peek();
                    break;
                case 4:
                    s.traverse();
                    break;
                case 5:
                    if(!s.isFull()){
                        System.out.println("Stack is not full");
                    }
                    break;
                case 6:
                    if(s.isEmpty()){
                        System.out.println("Stack is not empty");
                    }
                    break;
                case 7:
                    System.out.println("Exiting ...");
                    System.exit(0);
                    break;
            
                default:
                    System.out.println("Invalid option");
                    break;
            }
        }
    }
}
