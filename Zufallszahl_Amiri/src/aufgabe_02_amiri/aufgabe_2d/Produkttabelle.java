/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aufgabe_02_amiri.aufgabe_2d;

/**
 *
 * @author mamiri
 */
public class Produkttabelle {

    public static void main(String[] args) {
        for (int i = 1; i < 10; i++) {
            for (int j = 1; j < 10; j++) {
                System.out.println("\t"+"i=" + j + " * " + "j=" + i + "  =  " + i * j);
            }
        }
    }
}
