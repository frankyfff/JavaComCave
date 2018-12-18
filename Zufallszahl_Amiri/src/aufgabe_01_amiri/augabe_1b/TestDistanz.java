/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aufgabe_01_amiri.augabe_1b;

import java.awt.Point;

/**
 *
 * @author Moe
 */
public class TestDistanz {

    public static void main(String[] args) {
        Distanz dis = new Distanz();

        Point p = new Point(-5, 2);

        System.out.println(p);
        Point postiverPunkt = new Point(Math.abs(p.x), Math.abs(p.y));
        System.out.println(postiverPunkt);

        double abs = Distanz.dist(p);
        System.out.println("Abstand zum Null Punkt: " + abs);

    }

}
