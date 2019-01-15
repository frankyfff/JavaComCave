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
public class Position {
    
    private float preis;
    public int menge;

    public float getPreis() {
        return preis;
    }

    public void setPreis(float preis) {
        this.preis = preis;
    }

    public int getMenge() {
        return menge;
    }

    public void setMenge(int menge) {
        this.menge = menge;
    }

    public Position(float preis, int menge) {
        this.preis = preis;
        this.menge = menge;
    }
    
    
    
    
}
