package AuswahlMenue;

import javax.swing.JOptionPane;

/**
 *
 * @author mamiri
 */
public class AMenue {

    public static void main(String[] args) {

        while (true) {

            String input = JOptionPane.showInputDialog("1. Person anlegen\n"
                    + "2. Person aktualisieren\n"
                    + "3. Person löschen\n"
                    + "4. Personen ausgeben\n"
                    + "0. Beenden\n"
                    + "Ihre Auswahl");

            if (input == null) {
                System.exit(0);
            }

            switch (input) {
                case "1":
                    JOptionPane.showMessageDialog(null, "Person anlegen");
                    break;
                case "2":
                    JOptionPane.showMessageDialog(null, "Person aktualisieren");
                    break;
                case "3":
                    JOptionPane.showMessageDialog(null, "Person löschen");
                    break;
                case "4":
                    JOptionPane.showMessageDialog(null, "Personen ausgeben");
                    break;
                case "0":
                    System.exit(0);
                default:
                    JOptionPane.showMessageDialog(null, "Ab in die Ecke!");
            }
        }
    }

}
