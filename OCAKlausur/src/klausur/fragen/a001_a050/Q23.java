/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package klausur.fragen.a001_a050;

/**
 *
 * @author Moe
 */
public class Q23 {

    public static void main(String[] args) {

        int x = 100;
        int a = x++;
        int b = ++x;
        int c = x++;
        int d = (a < b) ? (a < c) ? a : (b < c) ? b : c;
        
    
    }
}
