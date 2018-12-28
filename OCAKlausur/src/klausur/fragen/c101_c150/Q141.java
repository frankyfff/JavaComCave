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
public class Q141 {
    
    public static void main(String[] args) {
        
        Q141 q = new Q141();
        System.out.println(isAvailable  + " ");
        isAvailable = doStuff();
        System.out.println(isAvailable);
    }
    
    public static boolean doStuff(){
        return !isAvailable;
    }
    
    static boolean isAvailable = false;
}
