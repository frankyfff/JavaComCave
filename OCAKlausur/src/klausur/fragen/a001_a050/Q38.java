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
public class Q38 {

    public static void main(String[] args) {
        double discount = 0;
        int qty = Integer.parseInt(args[0]);

        if (qty >= 90) {
            discount = 5.0;
        }
        if ((qty > 80) && (qty < 90)) {
            discount = 0.2;
        }
    }
}

/**
 *      And the given requirements
 *      If the value of the qty variable is greater than or equal to 90, discount = 0.5
 *      If the qty variable is between 80 and 90, discount = 0.2
 *      Which two code fragment can be independently placed at line n1 to meet the requirements
 * 
 * 
 * 
 */
