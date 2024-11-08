class Example3 extends Thread{
    public void run(){
        System.out.println("run() method");
    }
    public static void main(String args[]){
        Example3 e1 = new Example3();
        Example3 e2 = new Example3();
        System.out.println("name of t1 :" + e1.getName());
        System.out.println("name of t2 :" + e2.getName());

        e1.start();
        e2.start();
        e1.setName("praniv");
        System.out.println("after changing name of t1 :" + e1.getName());
        System.out.println("after changing name of t2 :" + e2.getName());
    }
}

