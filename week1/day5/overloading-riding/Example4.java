// constructor hierarchy

class A{
    public A(){
        System.out.println("constructor of A 
        ");
    }
    public void show(){
        System.out.println("class A");
    }
}

class B extends A{
    public B(){
        System.out.println("constructor of B");
    }
    public void show(){
        System.out.println("class B");
    }
}

public class Example4 {
    public static void main(String[] args) {
        B b = new B();
        b.show();
    }
}
