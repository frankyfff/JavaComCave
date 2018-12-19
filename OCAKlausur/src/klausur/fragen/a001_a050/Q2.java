/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package klausur.fragen.a001_a050;

import java.util.ArrayList;

/**
 *
 * @author mamiri
 */
public class Q2 {

    public static void main(String[] args) {
        ArrayList<Vehiclee> myList = new ArrayList<>();
        myList.add(new Motorcycle());
    }
}

class Motorcycle implements Transportation {

    int kmStand = 0;
    String name;

    public void maxSpeed() {

        System.out.println("Im Motorcycle");
    }

}

class Vehiclee implements Transportation {

    int name;
    int kmStand = 0;

    public void maxSpeed() {

        System.out.println("Im Vehiclee");
    }
}

interface Transportation {

    void maxSpeed();
}

/**
 * Which two statements , if either were true, would make the code compile?
 *
 * a) 
 * Vehicle is an interface that is implemented by the Motorcycle class. 
 * b)
 * Vehicle and Motorcycle both implement the Transportation interface. 
 * c)
 * Vehicle is a superclass of Motorcycle. 
 * d) 
 * Mototrcyclw is a superclass of Vehicle. 
 * e) 
 * Vehicle and Motorv´cycle both extend the Transportation superclass. 
 * f) 
 * Motorcycle is an interface that implements the Vehicle class.
 *
 *
 */
