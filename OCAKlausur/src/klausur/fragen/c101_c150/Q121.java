/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package klausur.fragen.c101_c150;

/**
 *
 * @author Moe
 */
public class Q121 {

    public static void main(String[] args) {
        C2 obj1 = new C1();
        I obj2 = new C1();

        C2 s = obj2;
        I t = obj1;

//        obj2.displayI();        // C1
//        obj1.displayC2();       // C2
        
        t.displayI();
        s.displayC2();

    }

}

class C2 {

    public void displayC2() {
        System.out.println("C2");
    }
}

interface I {

    public void displayI();
}

class C1 extends C2 implements I {

    public void displayI() {
        System.out.println("C1");
    }
}
