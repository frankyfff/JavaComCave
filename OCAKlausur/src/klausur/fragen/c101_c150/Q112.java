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
public class Q112 {

    public static void main(String[] args) {

        String str1 = "Java";
        String[] str2 = {"J", "a", "v", "a"};
        String str3 = "";

        for (String str : str2) {
            str3 = str3 + str;
        }

        boolean b1 = (str3 == str1);
        boolean b2 = (str3.equals(str1));
//
        System.out.println(b1 + " : " + b2);
//
//        String tmp1 = new String("Free Test of Hash");
//        String tmp2 = new String("Free Test of Hash");
//
//        System.out.println(tmp1.hashCode() + " : " + tmp2.hashCode());
//
//        boolean x = (-1370787459 == -1370787459);
//        System.out.println(x);
//        
//        int a = 3, b = 3;
//        boolean c = (a == b);
//        System.out.println(c);

    }
}
