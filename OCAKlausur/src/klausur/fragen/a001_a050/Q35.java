/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package klausur.fragen.a001_a050;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author Moe
 */
public class Q35 {
    public static void main(String[] args) {
        LocalDate date1 = LocalDate.now();
        LocalDate date2 = LocalDate.of(2014, 06, 20);
        LocalDate date3 = LocalDate.parse("2014-06-20", DateTimeFormatter.ISO_DATE);
        
        System.out.println(date1);
        System.out.println(date2);
        System.out.println(date3);
    }    
}
