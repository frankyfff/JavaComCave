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
public class Q114 {

    public static void main(String[] args) {

        int data[] = {2010, 2013, 2014, 2015, 2014};
        int key = 2014;
        int count = 0;

        for (int e : data) {

            if (e != key) {
                continue;
              count++;
                
            }
        }
        System.out.println("found");
    }
}

/**
 * What is the result? a) Compilation fals b) 0 Found c) 1 Found d) 3 Found
 *
 */
