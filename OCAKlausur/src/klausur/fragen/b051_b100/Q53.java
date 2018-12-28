/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package klausur.fragen.b051_b100;

/**
 *
 * @author Moe
 */
public class Q53 {

    public static void main(String[] args) {
            Vehicle v = new Vehicle();
//            System.out.println(v.x);
    }
}

class Vehicle {

    int x;

    Vehicle() {
        this(10);   // line n1
    }

    Vehicle(int x) {
        this.x = x;
    }
}

class Car extends Vehicle {

    int y;

    Car() {
        super();
        this(20);
    }

    Car(int y) {
        this.y = y;
    }

    @Override
    public String toString() {
        return super.x + " : " + this.y;
    }

}
