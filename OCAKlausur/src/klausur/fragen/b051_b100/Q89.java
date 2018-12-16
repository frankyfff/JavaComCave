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
public class Q89 {

    public static void main(String[] args) {
        String stuff = "TV";
        String res = null;

//        if (stuff.equals("TV")) {
//            res = "Walter";
//        } else if (stuff.equals("Movie")) {
//            res = "White";
//        } else {
//            res = "No result";
//        }

       

        //Which code fragment can replace the if block?
        //a)
        //stuff.equals("TV") ? res = "Walter" : stuff.equals("Movi") ? res = "White" : res = "No result";
        //b)
        //res = stuff.equals("TV") ? "Walter" else stuff.equals("Movie") ? "White" : "No result";
        //c)
//        res = stuff.equals("TV") ? stuff.equals("Movie") ? "Walter" : "White" :"No result";
//        System.out.println(res);
        //d)
        res = stuff.equals("TV") ? "Walter" : stuff.equals("Movie") ? "White" :"No result";
        System.out.println(res);
    }

}
