/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package klausur.fragen.a001_a050;

/**
 *
 * @author Moe
 */
public class Q9 {

    ElectricAccount ea = new ElectricAccount();

    public void useElectri() {
        ea.addKWh(0);
    }

}

class ElectricAccount {

    private double kWh = 0;
    private double rate = 0.07;
    private double bill;

    public void addKWh(double KWh) {
        if (KWh > 0) {
            this.kWh += KWh;
            this.bill = this.kWh * this.rate;
        }
    }

}
