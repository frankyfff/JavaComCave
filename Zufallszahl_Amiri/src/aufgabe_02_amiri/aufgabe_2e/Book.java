/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aufgabe_02_amiri.aufgabe_2e;

/**
 *
 * @author mamiri
 */
public class Book {

    private int id;
    private String titel;
    private int isbn;
    private String author;
    private int eJahr;

    public Book(int id, String titel, int isbn, String author, int eJahr) {
        this.id = id;
        this.titel = titel;
        this.isbn = isbn;
        this.author = author;
        this.eJahr = eJahr;
    }

    public int getId() {
        return id;
    }

    public String getTitel() {
        return titel;
    }

    public int getIsbn() {
        return isbn;
    }

    public String getAuthor() {
        return author;
    }

    public int geteJahr() {
        return eJahr;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setTitel(String titel) {
        this.titel = titel;
    }

    public void setIsbn(int isbn) {
        this.isbn = isbn;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void seteJahr(int eJahr) {
        this.eJahr = eJahr;
    }

    @Override
    public String toString() {
        return "id=" + id + ", titel=" + titel + ", isbn=" + isbn
                + ", author=" + author + ", eJahr=" + eJahr;
    }

}
