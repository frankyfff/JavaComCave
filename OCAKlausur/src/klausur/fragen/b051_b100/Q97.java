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
public class Q97 {

    public static void main(String[] args) {
        doSum(10, 20);
        doSum(10.0, 20.0);
    }

    public static void doSum(Integer X, Integer Y) {
        System.out.println("Integer sum is "+(X+Y));
    }

    public static void doSum(double x, double y) {
        System.out.println("double sum is " + (x+y));
    }

    public static void doSum(float x, float y) {
        System.out.println("float sum is "+(x+y));
    }

    public static void doSum(int x, int y) {
        System.out.println("int sum is "+(x+y));
    }

}
