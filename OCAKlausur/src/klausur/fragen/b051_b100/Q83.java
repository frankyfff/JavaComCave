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
public class Q83 {
    private char var;
    
    public static void main(String[] args) {
        char var1 = 'a';
        char var2 = var1;
        var2 = 'e';
        
        
        Q83 q1 = new Q83();
        Q83 q2 = q1;
        Q83 q3 = q2 = q1;
        
        q1.var = 'i';
        q2.var = 'o';
        q3.var = 'n';
        
        System.out.println(var1 + " : " + var2);
        System.out.println(q1.var + " : " + q2.var + " : " + q3.var);
    }

            
}


