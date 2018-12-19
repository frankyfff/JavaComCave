/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package klausur.fragen.a001_a050;

/**
 *
 * @author mamiri
 */
public class Q13 {

    DVD dvd = new DVD(10, 20);
}

class CD {

    int r;

    CD(int r) {
        this.r = r;
    }
}

class DVD extends CD {

    int c;

    DVD(int r, int c) {
        super(r);
        this.c = c; // line n1
    }
}

/**
 *      Which code fragment should you use at line n1 to instantiate the dvd object successfully?
 * 
 *      a)
 *      super.r = r;
 *      this.c = c;
 * 
 *      b)
 *      super(r);
 *      this(c);
 * 
 *      c)
 *      super(r);
 *      this. c = c;
 * 
 *      d)
 *      this.c = r;
 *      super(c);
 * 
 * 
 * 
 * 
 */
