/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aufgabe_01_amiri.augabe_1d;

import java.util.ArrayList;

/**
 *
 * @author Moe
 */
public class Buch {

    private static String titel;
    private static double isbn;
    private static String author;
    private ArrayList<Buch> bibliothek;

    private Buch(String author, double isnb, String titel) {
        this.author = author;
        this.isbn = isnb;
        this.titel = titel;
    }

    public static void addBook(ArrayList<Buch> buch) {
        new Buch(author, isbn, titel);
       
    }

    public void infoBook() {
        System.out.println("Author: " + author + ", Titel: " + titel + ", ISBN: " + isbn);
    }

    public String getTitel() {
        return titel;
    }

    public double getIsbn() {
        return isbn;
    }

    public String getAuthor() {
        return author;
    }

}
