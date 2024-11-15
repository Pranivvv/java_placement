class MyClass extends Thread {
    public void run(){
        try {
            for (int i = 0; i < 5; i++) {
                System.out.println("Child Thread");
                // Here current threads goes to sleeping state and Another thread g 
                Thread.sleep(1000);
            }
        }
        catch (InterruptedException e) {
            System.out.println("InterruptedException is occur");
        }
    }
}

class Examplr8 {
    public static void main(String[] args) throws InterruptedException{
        MyClass thread = new MyClass();
        thread.start();
        // main thread calls interrupt() method on child thread thread.interrupt();
        for (int i = 0; i < 5; i++) {
            System.out.println("Main Thread");
            Thread.sleep(1000);
        }
    }
}