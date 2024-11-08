class A{
    public int a=20;
    public void show(){
        System.out.println("class a");
        System.out.println("a = "+a);    
    }
}
class B extends A{
    //public int a=40;
    public void show(){
        System.out.println("class b");
        System.out.println("a = "+a);    
    }
}
class Example3{
    public static void main(String[] args) {
        B b = new B();
        b.show();
    }
}