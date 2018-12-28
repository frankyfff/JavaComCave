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
public class Q18 {

    public static void main(String[] args) {
        String shirts[][] = new String[2][2];
        shirts[0][0] = "red";
        shirts[0][1] = "blue";
        shirts[1][0] = "small";
        shirts[1][1] = "medium";

        for (int index = 0; index < 2; ) {
            for (int idx = 0; idx < 2; ) {
                System.out.println(shirts[index][idx]+" : ");
                idx++;
            }
            index++;
        }
        
        
    }
}

    /*   for (int index = 1; index < 2; index++) {
            for (int idx = 0; idx < 2;
                    idx++) {
                System.out.print(shirts[index][idx] + ":");
            }
        }
small : medium
     */
 /*
   for (int index = 0; index < 2; index++) {

            for (int idx = 0; idx < index; idx++) {
                System.out.print(shirts[index][idx] + ":");
            }
        }
red, blue, small, medium
     */

/*

        for (String sizes : shirts) {
            for(String s : sizes){
                System.out.println(s+" : ");
            }
        }

*/