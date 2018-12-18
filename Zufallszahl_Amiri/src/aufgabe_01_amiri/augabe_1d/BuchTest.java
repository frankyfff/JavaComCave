/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aufgabe_01_amiri.augabe_1d;

import java.util.ArrayList;

/**
 *
 * @author Moe
 */
public class BuchTest {

    public static void main(String[] args) {
        Buch buch1 = new Buch("Steven King", 314254, "Es");
        Buch buch2 = new Buch("Gustav Bergmann", 34546, "Geld stinkt nicht!");

        ArrayList<Buch> bibliothek = new ArrayList<Buch>();
        bibliothek.add(buch1);
        bibliothek.add(buch2);

        for (Buch buch : bibliothek) {
            buch.infoBook();
        }

        bibliothek.remove(buch2);

        for (Buch buch : bibliothek) {
            buch.infoBook();
        }
    }
}
