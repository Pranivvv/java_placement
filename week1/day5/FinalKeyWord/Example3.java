public class Example3 {
    final int i = 100;
    void me(){
        i = 53;
    }  
    public static void main(String[] args) {
        Example3 e = new Example3();
        e.me();
    }
}
