/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aufgaben_0e;

import java.util.Scanner;

/**
 *
 * @author Moe
 */
public class Begriffe {

    public static void main(String[] args) {

        String[] bezeichnungArray = {"A", "B", "C", "D", "E", "Stick"};
        String[] defArray = {"AAA", "BBB", "CCC", "DDD", "EEE", "20GB"};
        
        System.out.println("Bitte eine Buchstabe eingeben: ");
        
        //Speichern in var
        Scanner scan = new Scanner(System.in);
        String i = scan.nextLine();
        
    
        
        for (int j = 0; j < bezeichnungArray.length; j++) {
            if (i.equals(bezeichnungArray[j])) {
                System.out.println(defArray[j]);
            }
        }
    }
}
