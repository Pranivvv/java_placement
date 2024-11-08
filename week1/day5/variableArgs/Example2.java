public class Example2 {
    void a(int... x){
        System.out.println("variable args " + x);
    }
    void a(int x){
        System.out.println("normal args "+x);
    }
    public static void main(String[] args) {
        Example2 e = new Example2();
        e.a(10);
    }
}
