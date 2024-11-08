class A{
    public static synchronized void print(String name){
        for(int i=0; i<3; i++){
            System.out.println("batting : "+ name);
            try{
                Thread.sleep(1000);
            }
            catch(InterruptedException e){
                System.out.println(e);
            }
        }
    }
}
class thread1{
    
}

public class Example9 {
    public static void main(String[] args) {
        
    }
}
