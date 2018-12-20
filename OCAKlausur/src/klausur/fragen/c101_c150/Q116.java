/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package klausur.fragen.c101_c150;

/**
 *
 * @author mamiri
 */
public class Q116 {

    public static final int MIN = 1;

    public static void main(String[] args) {
        int x = args.length;
        if (checkLimit(x)) {
            System.out.println("Java SE");
        } else {
            System.out.println("Java EE");
        }
    }

    public static boolean checkLimit(int x) {
        return (x >= MIN) ? true : false;
    }
}


/++