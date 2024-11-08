interface I1{
    void m1();
    interface I2 {
        void m2();
    }
}

public class Example2 implements I1, I1.I2 {
    public void m1(){
        System.out.println("m1");
    }
    public void m2(){
        System.out.println("m2");
    }
    public static void main(String[] args) {
        Example2 e = new Example2();
        e.m1();
        e.m2();
    }
}
