/*
• Erstellen Sie ein Programm, das eine Zufallszahl zwischen 1 und 100 generiert.
• Der Benutzer soll über über die Standardeingabe die Zahl erraten.
• Solange der Benutzer die Zahl noch nicht erraten hat, 
  soll eine entsprechende Meldungausgegeben werden, z.B. "größer" oder "kleiner".
• Das Raten hat ein Ende, wenn der Benutzer die Zahl erraten hat.
    P.S.: Mit dem Audruck new Random().nextInt(upperRange) 
    kann man eine Zahl zwischen 0 und upperRange (exklusive) generieren.
 */
package zufallszahl_amiri;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Moe
 */
public class Zufallszahl_Amiri {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Random random = new Random();
        int tmpZahl = random.nextInt(99);

        while (true) {
            System.out.println("Bitte eine Zahl zwischen 0 und 99 erraten: ");
            Scanner scan = new Scanner(System.in);
            int benutzerEingabe = scan.nextInt();

            if (benutzerEingabe == tmpZahl) {
                System.out.println("Glückwunsch Sie haben die Zahl richtig erraten!");
                break;
            } else {
                System.out.println("Erstellte Zahl durch die Klasse Random:" + tmpZahl);
                System.out.println("Leider war der Versucht nicht korrekt, bitte versuchen Sie es nochmal!");
            }
        }
    }
}
