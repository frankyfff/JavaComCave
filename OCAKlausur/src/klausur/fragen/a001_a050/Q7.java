package klausur.fragen.a001_a050;

public class Q7 {

    public static void main(String[] args) {

        Car c1 = new Car("Auto");
        Car c2 = new Car("4W", 150, "Manual");
        System.out.println(c1.type + " " + c1.maxSpeed + " " + c1.trans);
        System.out.println(c2.type + " " + c2.maxSpeed + " " + c2.trans);
    }
}

class Vehicle {

    String type = "4W";
    int maxSpeed = 100;

    public Vehicle(String type, int maxSpeed) {
        this.type = type;
        this.maxSpeed = maxSpeed;
    }

}

class Car extends Vehicle {

    String trans;

    Car(String trans) {
        this.trans = trans;
    }

    Car(String type, int maxSpeed, String trans) {
        super(type, maxSpeed);
        this(trans);
    }

    public Car(String type, int maxSpeed) {
        super(type, maxSpeed);
    }

}

/*
    What is the result
    a)  4W 150 Auto
        4W 150 Manual
    b)  Null 0 Auto
        4W 150 Manual
    c)  Compilation fails only at line 30
    d)  Compilation fails only at line 36
    e)  Compilation fails at both line 30 and 36
*/