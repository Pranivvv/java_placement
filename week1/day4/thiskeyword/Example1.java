// class Example11 {
//     int a;
//     int b;
//     Example1(int a,int b){
//         a = a;
//         b = b;
//     }

//     void display() {
//         System.out.println("a = " + a + " b = " + b);
//     }
//     public static void main(String[] args) {
//         Example1 object = new Example1(40, 80);
//         object.display();
//     }
// }

// output:
// a=0 b=0


class Example1 {
    int a;
    int b;
    Example1(int a,int b){
        this.a = a;
        this.b = b;
    }

    void display() {
        System.out.println("a = " + a + " b = " + b);
    }
    public static void main(String[] args) {
        Example1 o = new Example1(40, 80);
        o.display();
    }
    
}