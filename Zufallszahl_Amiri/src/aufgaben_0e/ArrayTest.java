/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aufgaben_0e;

import java.util.ArrayList;

/**
 *
 * @author Moe
 */
public class ArrayTest {

    public static void main(String[] args) {
        ArrayList<Double> summeEintraege = new ArrayList<Double>();

        double[] zahlenArray = {1.1, 1.1, 1.1, 1.1, 1.1};
        double tmp = 0.0;
        
        for (int i = 0; i < zahlenArray.length; i++) {
            tmp += zahlenArray[i];
        }
        
        System.out.println(tmp);
        
        int[] newArray = {1, -2, 3, -4};
        int platzhalter = 0;
        for (int i = 0; i < newArray.length; i++) {
            platzhalter += newArray[i];
        }
        System.out.println(platzhalter);
    }
}
