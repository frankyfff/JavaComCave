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
public class Q79 {

    public static void main(String[] args) {

        int n[][] = {{1, 3}, {2, 4}};

        for (int i = n.length - 1; i >= 0; i--) {
            for (int y : n[i]) {
                System.out.print(y);
            }
        }

    }
}