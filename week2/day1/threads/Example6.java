

//join() method
class Mythread extends Thread{ 
    public void run(){
        for (int i=1;i<=10;i++){
            System.out.println("chil thread");
            try{
                Thread.sleep(100);
            }
            catch (InterruptedException ie){
            }
        }
    }
}

class Example6{
    public static void main(String args[]) throws InterruptedException{
        Mythread t=new Mythread();
        t.start();
        t.join();//main thread call child thread to join, and will wait until completing child thread
        for (int i=1;i<=10;i++){
            System.out.println("main thread");
        }
    }
}
