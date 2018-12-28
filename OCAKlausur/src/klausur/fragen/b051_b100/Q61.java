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
public class Q61 {
    public static void main(String[] args) {
        int[] intArr = {15,30,45,60,75};
        intArr[2] = intArr[4];
        intArr[4] = 90;
        
        for(int x : intArr){
            System.out.println(" "+x);
        }
    }
}

/**
 *      What are the values of each element in inArr after this code has executed?
 *      a) 15, 60, 45, 90, 75
 *      b) 15, 90, 45, 90, 75
 *      c) 15, 30, 75, 60, 90
 *      d) 15, 30, 90, 60, 90
 *      e) 15,  4, 45, 60, 90
 *  
 * 
 * 
 */