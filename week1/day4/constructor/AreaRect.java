class Rectangle{
    Rectangle(int l,int b){
        System.out.println("Area of rectangle : " + area(l,b));
    }

    public int area(int l, int b){
        return l*b;
    }
}

public class AreaRect {
    public static void main(String[] args) {
        Rectangle r = new Rectangle(4,5);
        Rectangle r1 = new Rectangle(7,8);
    }
    
}