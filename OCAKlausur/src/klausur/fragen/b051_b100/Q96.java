package klausur.fragen.b051_b100;

class A {

    public void test() {
        System.out.println("A");
    }
}

class B extends A {

    public void test() {
        System.out.println("B");
    }
}

class C extends A {

    public void test() {
        System.out.println("C");
    }
}

public class Q96 {

    public static void main(String[] args) {
        A x = new A();
        A y = new A();
        A z = new A();
        a1.test();
        B b1 = new B();
        b1.test();
        C c1 = new C();
        c1.test();
        
        A a4 = (B) a3;
        a4.test();
        

//        
//        A b2 = new C();         // b2 = C
//        b2.test();
//
//        b1 = (A) b2;            // b1 = C
//        b1.test();
// 
//        A b3 = (B) b2;          // ClassCastException
////        
////
//        b3 = (C) b2;
//        
//        b3.test();
//        b1.test();
//        b3.test();
    }
}
