
package klausur.fragen;
public class Q11 {
    public static void main(String[] args) {
        Book book1 = new EBook();
        book1.readBook();
    }
}

interface Readable {
    public void readBook();
    public void setBookMark();
}

abstract class Book implements Readable {
    public void readBook() {
    }
    
}

class EBook extends Book {
    public void readBook() {
    }
    
    public void setBookMark() {
    }
}

/*
    
    Which option  enables the code to compile?

    a)  Replace the codefragment at line 15 with:
        class Book implements Readable {
    b)  At line 18 insert:
        public abstract void setBookMark();
    c)  Replace the codefragment at line 21 with:
        abstract class EBook extends Book {
    d)  At line 24 insert:
        public void setBookMark(){}

*/