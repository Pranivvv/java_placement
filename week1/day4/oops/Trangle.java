class Calc{
    Calc(){
        double a = 4;
        double b = 5;
        double c = 6;
        
        System.out.println("area of trangle : " + area(a,b,c));
        
        System.out.println("area of trangle : " + perimeter(a,b,c));
    }
    public double perimeter(double a, double b, double c){
        return (a+b+c);
    }
    public double area(double a, double b, double c){
        double s = perimeter(a, b, c)/2;
        return Math.sqrt(s*(s-a)*(s-b)*(s-c));
    }
}

public class Trangle {
    public static void main(String[] args) {
        Calc c = new Calc();
    }
}
