/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question.question_140_150;

/**
 *
 * @author Moe
 */
public class Q141 {

    public static void main(String[] args) {
        Q141 ts = new Q141();
        System.out.println(isAvailable + " ");
        isAvailable = ts.doStuff();
        System.out.println(isAvailable + " ");

    }

    public static boolean doStuff() {
        return !isAvailable;
    }

    static boolean isAvailable = false;
}
