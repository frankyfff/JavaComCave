package klausur.fragen.b051_b100;

public class Q80 {

    public static void main(String[] args) {
        Caller c = new Caller();
        c.start();
    //  c.init();               //Weil es private ist!
    }
}


class Caller {

    private void init(){
        System.out.println("Initialized");
    }
    
    public void start(){
        init();
        System.out.println("Started");
    }
}

/*
    What is the result
    a)  An exception is thrown at runtime
    b)  Initialized
        Started
        Initialized
    c)  Initialized
        Started
    d)  Compilation fails
    
*/