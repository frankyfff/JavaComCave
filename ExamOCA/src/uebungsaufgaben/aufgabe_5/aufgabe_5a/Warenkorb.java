/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uebungsaufgaben.aufgabe_5.aufgabe_5a;

/**
 *
 * @author Moe
 */
public class Warenkorb {
    
    private Position[] postionen;

    public Position[] getPostionen() {
        return postionen;
    }

    public void setPostionen(Position[] postionen) {
        this.postionen = postionen;
    }

    public Warenkorb(Position[] postionen) {
        this.postionen = postionen;
    }
    
    
}
