/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testpackage;

/**
 *
 * @author mamiri
 */
public class Acc {

    int p;
    private int q;
    protected int r;
    public int s;

    public static void main(String[] args) {

        int a = 10;
        
        
        {
                int b = 30;
                System.out.println("TTT");
                a = 20;
        }

        System.out.println(a + " : " + b);
    }

}
