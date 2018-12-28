/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package klausur.fragen.c101_c150;

/**
 *
 * @author Moe
 */
public class Q110 {

    public static void main(String[] args) {
        int[] stack = {10, 20, 30};
        int size = 3;
        int idx = 0;

//        do {
//            idx++;                  // idx = 1
//        }while (idx >= size);       // stack[1] = 20;
//          while(idx < size) {         //  1Runde: 0 < 3         idx = 1       
//              idx++;                  //  2Runde: 1 < 3         idx = 2    
//              System.out.println(idx);
//          }                           //  3Runde: 2 < 3         idx = 3   
//                                      //  3Runde: 3 < 3         false 
//            do {                        //  idx = 1             1Runde: 1 < 3-1         
//                idx++;                  //  idx = 2             false
//                System.out.println(idx);
//            } while(idx < size - 1);    
//        do {                                            //  idx = 1             1Runde: 1 <= 3  
//            idx++; 
//            System.out.println(idx);                    //  idx = 2             1Runde: 2 <= 3  
//        } while (idx <= size);                          //  idx = 3             1Runde: 3 <= 3  
//                                                        //  idx = 4             false 
        
            while(idx <= size - 1) {                      //  idx = 0             1Runde: 0 <= 2  
                idx++; 
                System.out.println(idx);                  //  idx = 1             1Runde: 1 <= 2  
            }                                             //  idx = 2             1Runde: 2 <= 2  
                                                          //  idx = 3             false 
            
            System.out.println("stack: " + stack[idx]);

    }
}
