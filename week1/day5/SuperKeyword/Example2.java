
class Person {
    void message(){
        System.out.println("I am person class");
    }
}

class Child extends Person {
    void message(){
        System.out.println("I am child class");
    }
    void show(){
        message();
        super.message();
    }
}

public class Example2 {
    public static void main(String[] args) {
        Child c = new Child();
        c.show();
    }
}
