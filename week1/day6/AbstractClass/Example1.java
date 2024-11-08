abstract class Test{
    abstract void m1();
    abstract void m2();
    abstract void m3();
    void m4(){
        System.out.println("m4 non-abstract method");
    }
}

public class Example1 extends Test {

    @Override
    void m1() {
        System.out.println("m1");
    }

    @Override
    void m2() {
        System.out.println("m2");
    }

    @Override
    void m3() {
        System.out.println("m3l");
    }
    
    public static void main(String[] args) {
        
    }
}
