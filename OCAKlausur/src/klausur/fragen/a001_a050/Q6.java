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
public class Q6 {
    public static void main(String[] args) {
        Earth earth = new Earth();
        earth.revlove();
        earth.rotate();
    }
}

abstract class Planet {

    protected void revolve() {
        System.out.println("Planet --> protected revlove");
    }

    abstract void rotate();
}

class Earth extends Planet {

    void revlove() {
        System.out.println("Earth --> default revlove");
    }

    protected void rotate() {
        System.out.println("Earth --> protected revlove");
    }
}
