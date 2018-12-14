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

public class Q96 extends A {

    public void test() {
        System.out.println("C");
    }

    public static void main(String[] args) {
        A b1 = new A();
        A b2 = new Q96();
        b1 = (A) b2;
        A b3 = (B) b2;
        b3 = (Q96) b2;
        b1.test();
        b3.test();
    }
}
