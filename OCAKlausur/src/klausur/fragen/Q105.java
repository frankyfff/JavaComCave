package klausur.fragen;




import java.util.ArrayList;

public class Q105 {
    public static void main(String[] args) {
        ArrayList<Integer> points = new ArrayList<>();
        points.add(1);
        points.add(2);
        points.add(3);
        points.add(4);
        points.add(null);
        points.remove(2);
        points.remove(null);
        System.out.println(points);
    }
}


/*
    a)  A NullPointerException is thrown at runtime.
    b)  [1, 2, 4]
    c)  [1, 2, 4, null]
    d)  [1, 3, 4, null]
    e)  [1, 3, 4]
    f)  Compilation fails

*/