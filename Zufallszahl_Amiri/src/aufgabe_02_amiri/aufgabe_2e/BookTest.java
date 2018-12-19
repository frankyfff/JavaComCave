/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aufgabe_02_amiri.aufgabe_2e;

import java.util.ArrayList;

/**
 *
 * @author mamiri
 */
public class BookTest {

    public static void main(String[] args) {

        Book b1 = new Book(1, "Kochen", 123456, "Steven King", 1990);
        Book b2 = new Book(2, "Kochen", 123456, "Steven King", 1990);
        Book b3 = new Book(3, "Kochen", 123456, "Steven King", 1990);
        Book b4 = new Book(4, "Essen", 122222, "Steven King", 1990);
        Book b5 = new Book(5, "Kochen", 123456, "Steven King", 1990);

        Book[] lib = new Book[5];
        lib[0] = b1;
        lib[1] = b2;
        lib[2] = b3;
        lib[3] = b4;
        lib[4] = b5;

        for (int i = 0; i < lib.length; i++) {
            System.out.println(lib[i].toString());
        }

        for (Book book : lib) {

            System.out.println(book.getTitel());
        }

        for (int i = 0; i < 10; i++) {

        }
        System.out.println("#####################################");
        int a = 0;
        while (a < lib.length) {
            System.out.println(lib[a].getIsbn());
            a++;

        }

        // ArrayList<Book> lib2 = new ArrayList(); 
//        Book b1 = new Book(1, "Kochen", 123456, "Steven King", 1990);
//        lib2.add(b1);
    }
}
