/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package klausur.fragen.b051_b100;

/**
 *
 * @author Moe
 */
public class Q52 {

    public static void main(String[] args) {
        String[] strs = new String[2];
        int idx = 0;
        
        strs[0] = "aaa";
        strs[1] = "bbb";

        for (String s : strs) {
            strs[idx].concat(" element " + idx);
             System.out.print(strs[idx]);
            idx++;
            
           
        }

//        for (idx = 0; idx < strs.length; idx++) {
//            System.out.println(strs[idx]);
//        }
    }
}
