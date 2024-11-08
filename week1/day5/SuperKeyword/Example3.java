class Person{
    Person(){
        System.out.println("This is Person class Constructor");
    }
}

class Student extends Person{
    Student(){
        super();
        System.out.println("This is Student class Constructor");
    }
}

public class Example3 {
    public static void main(String[] args) {
        Student s = new Student();

    }
}
