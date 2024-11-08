public class Example1 {
    void a(char a, int... x){
        System.out.print(a);
        for(int a1:x){
            System.out.print(" "+a1);
        }
        System.out.println("");
    }
    public static void main(String[] args) {
        Example1 e = new Example1();
        e.a('a');
        e.a('b',10);
        e.a('c',10,20); 
    }
}
