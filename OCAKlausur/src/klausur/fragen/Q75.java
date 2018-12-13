
package klausur.fragen;

public class Q75 {
  
    public static void main(String[] args) {
       
        int nums1[] = new int[3];
        int nums2[] = {1,2,3,4,5};
        
        nums1 = nums2;
        
        for (int x : nums1) {
            System.out.print(x + ":");
        }
        
    }
}

/*
    What is the result

    a)  1:2:3:4:5:
    b)  1:2:3:
    c)  Compilation fails
    d)  An ArrayBoundException is thrown at runtime.

*/