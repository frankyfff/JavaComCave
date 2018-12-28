/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package klausur.fragen.a001_a050;

/**
 *
 * @author Moe
 */
public class Q30 {
    public static void main(String[] args) {
      
        String[] arr = {"A","B","C","D"};
        
        for (int i = 0; i < arr.length; i++) {
            
            System.out.println(arr[i] + " ");
            if (arr[i].equals("C")) {
                continue;
            }
            System.out.println("Work done");
            break;
        }
    }
}

/**
 *      What is the resault
 *      a) A B C Work done
 *      b) A B C D Work done
 *      c) A Work done
 *      d) Compilation fails
 * 
 * 
 * 
 */
