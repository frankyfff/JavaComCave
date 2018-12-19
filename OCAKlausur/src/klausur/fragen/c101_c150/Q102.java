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
public class Q102 {
    public static void main(String[] args) {
       App.displayMsg();
    }
}

class App {

    int count;

    public static void displayMsg() {
        count++;
        System.out.println("Welcome " + "Visit Count: " + count);
    }

}
