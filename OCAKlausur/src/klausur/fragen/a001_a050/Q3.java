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
 * @author mamiri
 */
public class Q3 {
    public static void main(String[] args) {
        String date = LocalDate.parse("2014-05-04").format(DateTimeFormatter.ISO_DATE_TIME);
        System.out.println(date);
    }
}


/**
 *      What is the result?
 * 
 *      a)  May 04, 2014T00:00:00.000 
 *      b)  2014
 *      c)
 *      d)
 * 
 * 
 * 
 * 
 */