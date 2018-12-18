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
public class Distanz {

    //Abstand zum Null Punkt
    public static double dist(Point p) {
        double tmp = (Math.sqrt(((p.x) * (p.x)) + ((p.y) * (p.y))));
        return tmp;
    }

}
