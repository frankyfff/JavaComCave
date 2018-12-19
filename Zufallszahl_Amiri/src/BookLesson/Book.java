/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BookLesson;

/**
 *
 * @author mamiri
 */
public class Book {

    private String titel;
    private static int maxAnzahl = 3;
    private static int anzahlBooks = 0;
    private static Book myBook;

    public String getTitel() {
        return titel;
    }

    public static int getMaxAnzahl() {
        return maxAnzahl;
    }

    public static void setMaxAnzahl(int maxAnzahl) {

        if (maxAnzahl >= anzahlBooks) {
            Book.maxAnzahl = maxAnzahl;
        } else {
            System.out.println("Momentaner Max.: " + Book.maxAnzahl);
        }

    }

    private Book(String titel) {
        this.titel = titel;
        anzahlBooks++;
    }

    public static Book createBook(String titel) throws RuntimeException {

        if (anzahlBooks < maxAnzahl) {
            myBook = new Book(titel);
            return myBook;
        } else {
            throw new RuntimeException("Anzahl Bücher überschritten!");
        }

    }

}
