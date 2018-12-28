/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package klausur.fragen.c101_c150;

/**
 *
 * @author Moe
 */
public class Q138 {
    public static void main(String[] args) {
        int x = 1;
        int y = 0;
        if(x++ > ++y) {
            System.out.print("Hello ");
        } else {
            System.out.println("IM ELSE");
            System.out.println("X: "+x);
            System.out.println("Y: "+y);
            System.out.print("Welcome ");
        }
        System.out.println("Log " + x + " : " + y);
    }
}
