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
public class Q92 {

    public static void main(String[] args) {
        WildAnimal wolf = new WildAnimal("Long");
        WildAnimal tiger = new WildAnimal("Feline", 80, "Short");

        System.out.println(wolf.type + " : " + wolf.maxSpeed + " : " + wolf.bounds);
        System.out.println(tiger.type + " : " + tiger.maxSpeed + " : " + tiger.bounds);
    }
}

class Animal {

    String type = "Canine";
    int maxSpeed = 60;

    Animal() {
    }

    Animal(String type, int maxSpeed) {
        this.type = type;
        this.maxSpeed = maxSpeed;
    }

}

class WildAnimal extends Animal {

    String bounds;

    WildAnimal(String bounds) {
        // n1
        super();
        this.bounds = bounds;
    }

    public WildAnimal(String type, int maxSpeed, String bounds) {
        //n2
        super(type, maxSpeed);
        this.bounds = bounds;
    }

}


/**
 *      Which two modification enalbe the code to print the following output?
 *      Canine 60 Long
 *      Feline 80 Short
 * 
 *      a) Replace line n1 with:
 *         super();
 *         this.bounds = bounds;
 * 
 *      b) Replace line n1 with;
 *         this.bounds = bounds;
 *         super();
 * 
 *      c) Replace line n2 with;
 *         super(type, maxSpeed);
 *         this(bounds);
 * 
 *      d) Replace line n1 with;
 *         this("Canine", 60);
 *         this.bounds = bounds;
 * 
 *      e) Replace line n2 with;
 *         super(type, maxSpeed);
 *         this.bounds = bounds;
 */
