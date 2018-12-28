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
public class Q50 {
    public static void main(String[] args) {
        String str1 = "Java";
        String str2 = new String("java");
        
        
        
        if(str1.equalsIgnoreCase(str2)) {
            System.out.println("Equals");
        } else {
            System.out.println("Not Equals");
        }
    }
}
