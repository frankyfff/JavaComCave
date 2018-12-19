package klausur.fragen.a001_a050;

public class Q28 {

    static int i;
    int j;

    public static void main(String[] args) {

        System.out.println(Q28.i);    
        
        Q28 q1 = new Q28();
        Q28 q2 = new Q28();

        q1.i = 3;
        q1.j = 4;

        System.out.println(Q28.i);
        
        q2.i = 5;
        q2.j = 6;

        System.out.println(
                q1.i + " "
                + q1.j + " "
                + q2.i + " "
                + q2.j + " "
        );
    }

}
/*
What is the result?

a)  3 4 5 6
b)  3 4 3 6
c)  5 4 5 6
d)  3 6 4 6

 */
