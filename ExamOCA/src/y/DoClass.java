/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package y;

import x.*;

/**
 *
 * @author Moe
 */
public class DoClass implements DoInterface{
    int x1, x2;

    public DoClass() {
        this.x1 = 0;
        this.x2 = 0;
    }
    
    public void m1(int p1){
        x1+=p1;
        System.out.println(x1);
    }
    
    public void m2(int p1){
        x2+=p1;
        System.out.println(x2);
    }
    
}
