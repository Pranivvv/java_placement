interface It1{
    double m1(int a,String str);
}

public class Example3 implements It1 {
    public double m1(int a, String str){
        System.out.println("m1 2- args method");
        return 22.02;
    }
    public int m1( char a){
        System.out.println("m1 1-args method");
        return 20;
    }
    public static void main(String[] args) {
        Example3 e = new Example3();
        int i = e.m1('a');
        System.out.println(i);
        double d = e.m1(90, "jdk");
        System.out.println(d);
    }
}
