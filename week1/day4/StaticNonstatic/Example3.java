// public class Example3 {
//     int i =10;
//     static{
//         System.out.println(i);
//     }
//     public static void main(String[] args) {
//         int j=20;
//         System.out.println(j);
//     }
// }

// output:
// Example3.java:4: error: non-static variable i cannot be referenced from a static context
//         System.out.println(i);

public class Example3 {
    static int i =10;
    static{
        System.out.println(i);
    }
    public static void main(String[] args) {
        int j=20;
        System.out.println(j);
    }
}