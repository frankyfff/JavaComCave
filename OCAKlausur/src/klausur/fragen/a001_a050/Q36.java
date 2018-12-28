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
public class Q36 {
    public static void main(String[] args) {
        StringBuilder sb1 = new StringBuilder("Duke");
        String str1 = sb1.toString();
        
        String str2 = str1;
        
        System.out.println(str1 == str2);
    }
}
/**
 *          Which code fragment, when iserted at line 9, enables the code to print true.
 *          a) String str2 = str1;
 *          b) String str2 = new String(str1);
 *          c) String str2 = sb1.toString();
 *          d) String str2 = "Duke";
 * 
 * 
 * 
 * 
 */