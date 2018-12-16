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
public class Q76 {

    public static void main(String[] args) {
        Product p1 = new Product(101, "Pen");
        Product p2 = new Product(101, "Pen");
        Product p3 = p1;

        boolean answer1 = p1 == p2;
        boolean answer2 = p1.name.equals(p2.name);
        System.out.println(answer1 + " : " + answer2);
    }
}

class Product {

    int id;
    String name;

    public Product(int id, String name) {
        this.id = id;
        this.name = name;
    }
}

/**
 *      What is the result?
 *      a) true : true
 *      b) true : false
 *      c) false : true
 *      d) false : false
 * 
 */