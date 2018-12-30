/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package klausur.fragen.a001_a050;

/**
 *
 * @author mamiri
 */
public class Q01 {
    
    public void updatePrice(Product product, double price){
        price = price * 2;
        product.price = product.price + price;
    }
    public static void main(String[] args) {
        Product prt = new Product();
        prt.price = 200;
        double newPrice = 100;
        
        Q01 q = new Q01();
        q.updatePrice(prt, newPrice);
        System.out.println(prt.price + " : " + newPrice);
    }
}

class Product {
    double price;
}

/**
 *      What is the resault?
 * 
 *      a)
 *      200.0 : 100.0
 * 
 *      b)
 *      400.0 : 200.0
 * 
 *      c)
 *      400.0 : 100.0
 * 
 *      d)
 *      Compilation fails.
 * 
 * 
 * 
 */