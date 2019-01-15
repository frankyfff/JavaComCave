/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question.question_130_140;

/**
 *
 * @author Moe
 */
public class Q138 {
    public static void main(String[] args) {
        int x = 1;
        int y = 0;
        
        x++;    // x = X+1;     // x += 1
        ++y;
        
        System.out.println("x++: " +x+ " : " + " ++y: " + y);
        
        if(x++ > ++y) {
            System.out.print("Hello ");
        } else {
            System.out.print("Welcome ");
        }
        System.out.println("Log " + x + " : " + y);
    }
}
