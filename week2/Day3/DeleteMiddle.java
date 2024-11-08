public class DeleteMiddle {
int stacks[] = new int[5] ;  // Declare a Stack of size  5
int top = -1;
    public int pop(){
            return(stacks[top--]);
        }
    

    public void push(int pushed_char){
            top++;
            stacks[top]=pushed_char;
    }

    public void display(){
        for (int i = 0; i<=top;i++) {
            System.out.print(stacks[i]+" ");
        }
    }

    public static void main(String[] args) {
        int mid = 5/2;
        DeleteMiddle  a = new DeleteMiddle();
        DeleteMiddle  b = new DeleteMiddle();

        a.push(1);
        a.push(2);
        a.push(3);
        a.push(4);
        a.push(5);

        a.display();

        for (int i = 0; i < mid; i++) {
            b.push(a.stacks[i]);
        }
        System.out.println("");
        for (int i = mid+1; i < 5; i++) {
            b.push(a.stacks[i]);
        }
        b.display();
    }
}
