// public class Example5 {
//     static int i = 10;
//     public void show(){
//         System.out.println(i);
//     }  
//     static{
//         show();
//     }
//     public static void main(String[] args) {
//         i++;
//         System.out.println(i);
//     }
// }

// output:
// Example5.java:7: error: non-static method show() cannot be referenced from a static context
//         show();


public class Example5 {
    static int i = 10;
    public static void show(){
        System.out.println(i);
    }  
    static{
        show();
    }
    public static void main(String[] args) {
        i++;
        System.out.println(i);
    }
}