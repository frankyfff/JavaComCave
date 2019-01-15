/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question.question_130_140;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author Moe
 */
public class Q134 {
    public static void main(String[] args) {
        String[] arr = {"HI","HOW","ARE","YOU"};
        List<String> arrList = new ArrayList<>(Arrays.asList(arr));
        
        for(String a : arrList){
            System.out.println(a);
        }
        
    }    
}
