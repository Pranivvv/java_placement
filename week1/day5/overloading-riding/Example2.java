class Parent{
    public void prop(){
        System.out.println("property");
    }
    public void bike(){
        System.out.println("pulser");
    }
}

class Child extends Parent{
    public void bike(){
        System.out.println("HB");
    }
}

public class Example2 {
    public static void main(String[] args) {
        Child c = new Child();
        c.prop();
        c.bike();
    }    
}

