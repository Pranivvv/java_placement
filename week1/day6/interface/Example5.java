interface I1{
    void m1();
    default void m2(){
        System.out.println("default");
    }
    static void m3(){
        System.out.println("static");
    }
}

public class Example5 implements I1{

    @Override
    public void m1() {
        System.out.println("normal method");
    }
    public static void main(String[] args) {
        Example5 e = new Example5();
        e.m1();
        e.m2();
        I1.m3();
    }   
}
