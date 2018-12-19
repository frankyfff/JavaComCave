/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package klausur.fragen.b051_b100;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author mamiri
 */
public class Q90 {

    public static void main(String[] args) {
        List ps = new ArrayList();
        Patient p2 = new Patient("Mike");
        ps.add(p2);

      // int f = ps.indexOf{new Patient("Mike")};
       //int f = ps.indexOf(p2)
       
       Patient p = new Patient("Mike");
       int f = ps.indexOf(p)
        
        if(f >= 0) {
            System.out.println("Mike Found");
        }
    }
}

class Patient {

    String name;

    public Patient(String name) {
        this.name = name;
    }

}
