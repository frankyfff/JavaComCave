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
public class TestBook {

    public static void main(String[] args) {
        Book myBook1 = Book.createBook("TestBook1");
        System.out.println(myBook1.getTitel());
        Book myBook2 = Book.createBook("TestBook2");
        System.out.println(myBook2.getTitel());
        Book myBook3 = Book.createBook("TestBook3");
        System.out.println(myBook3.getTitel());
        
        Book.setMaxAnzahl(2);
        
//        Book myBook4 = Book.createBook("TestBook4");
//        System.out.println(myBook4.getTitel());
        //  Book myBook4 = Book.createBook("TestBook");

    }
}
