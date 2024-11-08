public class MyThread extends Threads{
    public void run(){
        for(int i=1; i<=0; i++){
            System.out.println("child thread");
        }
    } 
}

public class example1{
    public static void main(String args[]){
        MyThread t = new MyThread();
        
    }
}
