/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question.question_140_150;

/**
 *
 * @author Moe
 */
public class Q140 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4};
        int i=0;
        do{
            System.out.print("i: "+i + " ");
            System.out.print("arr[i]: " + arr[i] + " ");
            i++;
            System.out.println("i++: " + i);
        } while(i < arr.length - 1);
    }
}

/**
 *      i    arr[i]   i++     i<arr.length-1
 *      0       1       1           2               
 *      1       2       2           2
 *      2       3       3   springt raus aus Bedingung 
 */