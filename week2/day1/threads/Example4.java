public class Example4 extends Thread{
    public void run(){
        System.out.println(" inside run");
    }
    public static void main(String[] args) {
        Example4 e1 = new Example4();
        Example4 e2 = new Example4();
        Example4 e3 = new Example4();
        System.out.println(" priority of t1 :"+ e1.getPriority());
        System.out.println(" priority of t2 :"+ e2.getPriority());
        System.out.println(" priority of t3 :"+ e3.getPriority());
        e1.setPriority(2);
        e2.setPriority(5);
        e3.setPriority(8);
        System.out.println(" priority of t1 :"+ e1.getPriority());
        System.out.println(" priority of t2 :"+ e2.getPriority());
        System.out.println(" priority of t3 :"+ e3.getPriority());
        System.out.println(Thread.currentThread().getName());
        System.out.println("priority of main : "+Thread.currentThread().getPriority() );
        Thread.currentThread().setPriority(1);
        System.out.println("priority of main : "+Thread.currentThread().getPriority() );

    }
}
