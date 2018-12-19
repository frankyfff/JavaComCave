/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aufgabe_02_amiri.aufgabe_2c;

/**
 *
 * @author mamiri
 */
public class DoppelterWert {

    public static void main(String[] args) {
        for (int i = 1; i < 9; i++) {
            System.out.println(i);
        }
        System.out.println("################");
        for (int i = 1; i < 9; i++) {
            System.out.println(i * 2);
        }
        System.out.println("################");
          for (int i = 1; i < 9; i++) {
            System.out.println(Math.sqrt(i));
        }
    }

}
