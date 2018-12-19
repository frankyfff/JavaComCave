/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aufgabe_02_amiri.aufgabe_2a;

import javax.swing.JOptionPane;

/**
 *
 * @author Moe
 */
public class AuswahlMenue {

    String input = JOptionPane.showInputDialog("1. Person anlegen\n" + "2. Personen aktualisieren\n"
            + "3. Personen löschen\n" + "4. Personen ausgeben\n" + "0. Beenden\n" + "Ihre Auswahl");
    
    public void checkInput(){
        if(input.equals("1")){
            System.out.println("anlegen");
            JOptionPane.showMessageDialog(null, "anlegen");
        } else if(input.equals("2")) {
            System.out.println("aktualisieren");
        }
    }
}
