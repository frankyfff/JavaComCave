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
public class Q106 {
    public static void main(String[] args) {
        
        int numbers[];
        numbers = new int[2];
        
        numbers[0] = 10;
        numbers[1] = 20;
        
        numbers = new int[4];
        numbers[2] = 30;
        numbers[3] = 40;
        
        for(int x : numbers){
            System.out.println(" " + x);
        }
        
    }
}


/**
 *     what is the resault?
 * 
 *      a) 10 20 30 40
 *      b) 0  0  30 40
 *      c) Compilation fails
 *      d) An exceptions is thrown at runtime
 * 
 */