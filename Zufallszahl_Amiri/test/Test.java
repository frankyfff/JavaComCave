/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mamiri
 */
public class Test {

    public static void main(String[] args) {

        aussen:
        for (int i = 0; i < 10; i++) {

            innen:
            for (int j = 0; j < 10; j++) {
                System.out.println(" i + j: " + i + j);
                if ((i + j + 1) % 7 == 0) {
                    break innen;
                }
            }

           // System.out.println(i);

        }

    }
}
