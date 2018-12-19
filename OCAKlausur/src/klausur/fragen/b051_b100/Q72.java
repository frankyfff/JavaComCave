/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package klausur.fragen.b051_b100;

/**
 *
 * @author mamiri
 */
public class Q72 {

    public static void main(String[] args) {
        try {
            method1();
        } catch (Exception e) {
            System.out.println("A");
        }
    }

    public static void method1() {  //line n1
        try {
            throw Math.random() > 0.5 ? new MyException() : new RuntimeException();
        } catch (Exception e) {
            System.out.println("B");
        }
    }
}

public class MyException extends RuntimeException {

}

/**
 *          What is the resault?
 *      
 *          a)
 *          A
 * 
 *          b)
 *          B
 * 
 *          c)
 *          Either A or B
 * 
 *          d)
 *          A B
 * 
 *          e)
 *          A compile time error occurs at line n1
 * 
 * 
 * 
 * 
 * 
 */
