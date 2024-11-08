public class Example1 {
    
    public void add(int a){
        System.out.println(a+a);
    }
    
    public void add(int a, int b){
        System.out.println(a+b);
    }

    public void add(int a,int b,int c){
        System.out.println(a+b+c);
    }

    public static void main(String[] args) {
        Example2 e = new Example2();
        e.add(2);
        e.add(4,5);
        e.add(11, 33, 22);
    }
}
