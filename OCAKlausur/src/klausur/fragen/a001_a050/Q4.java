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
public class Q4 {

    public static void main(String[] args) {
        short s1 = 200;
        Integer s2 = 400;
        Long s3 = (long) s1 + s2;   

//      String s4 = (String) (s3 * s2);
//      System.out.println("Sum is: " + s4);
    }
}


/*
    a)  sum is 600.
    b)  compilation faila at line 17.
    c)  compilation fails at line 19.               
    d)  A ClassException is thrown at line 17. 
    e)  A ClassException is thrown at line 19.

*/