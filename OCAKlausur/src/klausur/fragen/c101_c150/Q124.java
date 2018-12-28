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
public class Q124 {

    public static void main(String[] args) {
        int wd = 0;
        String[] days = {"sun", "mon", "wed", "sat"};
        for (String s : days) {
            switch (s) {
                case "sat":
                case "sun":             //      sun     mon     wed     sat
                    wd -= 1;            // wd = -1                      3             
                    break;
                case "mon":
                    wd++;               // wd =          0
                case "wed":
                    wd += 2;            // wd =          2       4

            }
        }
        System.out.println(wd);
    }
}
