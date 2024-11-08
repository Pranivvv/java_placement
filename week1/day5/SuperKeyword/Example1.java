
class VehicleParent{
    int speed =10;
}

class Vehicle extends VehicleParent{
    int speed =170;
}

class car extends Vehicle{
    int speed = 130;
    public void show(){
        System.out.println("speed in class car is "+ speed);
        System.out.println("speed in class vehical is "+ super.speed);
    }
}
public class Example1 {
    public static void main(String[] args) {
        car c = new car();
        c.show();
    }    
}
