/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package klausur.fragen.c101_c150;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import javafx.util.converter.LocalDateTimeStringConverter;


/**
 *
 * @author mamiri
 */
public class Q115 {

    public static void main(String[] args) {
        
        LocalDateTime dt =  LocalDateTime.of(2014,7,31,1,1);
        dt.plusDays(30);
        dt.plusMonths(1);
        System.out.println(dt.format(DateTimeFormatter.ISO_DATE));
        
        
    }
}
