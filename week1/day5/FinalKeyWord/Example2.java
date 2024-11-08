class A{
    final void demo(){
        System.out.println("calss A method");
    }
}

public class Example2 extends A {
    void demo(){
        System.out.println("calss Example2 method");
    }

    public static void main(String[] args) {
        Example2 e = new Example2();
        e.demo();
    }
}
