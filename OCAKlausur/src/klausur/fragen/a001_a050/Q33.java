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
public class Q33 {

    public static void main(String[] args) {
        Alpha alpha1 = new Alpha(50);
        Alpha alpha2 = new Alpha(125);
        Alpha alpha3 = new Alpha(100);

        alpha1.doPrint();
        alpha2.doPrint();
        alpha3.doPrint();
    }
}

class Alpha {

    int ns;
    static int s;

    Alpha(int ns) {
        if (ns > s) {
            s = ns;
            this.ns = ns;
        }
    }

    void doPrint() {
        System.out.println("ns = " + ns + " s = " + s);
    }

}
