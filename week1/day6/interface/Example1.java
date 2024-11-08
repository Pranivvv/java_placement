
interface Abc{
    public void show();
}
class Pqr{
    static int i =120;
}

public class Example1 extends Pqr implements Abc{

    @Override
    public void show() {
        System.out.println("I am in Abc");
    }

    public static void main(String[] args) {
        Abc a;
        
        Example1 x = new Example1(); 
        a = x;
        a.show();
        System.out.println(i);
    }
    
}
