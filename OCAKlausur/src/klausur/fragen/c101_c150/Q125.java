package klausur.fragen.c101_c150;

import java.time.LocalDate;



public class Q125 {

    public static void main(String[] args) {
        LocalDate date = LocalDate.of(2012, 01, 32); 
        date.plusDays(10);
        System.out.println(date);
    }
}


/*

    What is the resault
    a)  2012-02-10
    b)  2012-02-11
    c)  Complitation fails
    d)  A DateTimeException is thrown at runtime.       


*/