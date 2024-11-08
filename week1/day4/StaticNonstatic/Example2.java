// public class Example2 {
//     int n;
//     public static void main(String[] args) {
//         System.out.println(n);
//     }
// }

// output :
// Example2.java:4: error: non-static variable n cannot be referenced from a static context
//         System.out.println(n);

public class Example2 {
    static int n;
    public static void main(String[] args) {
        System.out.println(n);
    }
}