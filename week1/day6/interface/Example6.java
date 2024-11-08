interface I1{
    default void m1(){
        System.out.println("I1");
    }
}
interface I2{
    default void m1(){
        System.out.println("I2");
    }
}

public class Example6 implements I1,I2{
    public void m1(){
        System.out.println("calss Example6");
    }
    public static void main(String[] args) {
        new Example6().m1();
    }
}
