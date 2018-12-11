
import sun.applet.Main;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mamiri
 */
public class Q17 {
    
    public int amount;
    
    public Q17( int amount){
        this.amount = amount;
    }

    public int getAmount() {
        return amount;
    }
    
    public void changeAmount(int x ) {
        amount += x;
    }
    
    public static void main(String[] args) {
        Q17 acct = new Q17((int)(Math.random() * 1000));
        
        //this.amount = 0;
        //amount = 0;
        //acct(0);
     acct.amount = 0;
        //acct.getAmount() = 0;
        //acct.changeAmount(0);
    // acct.changeAmount(-acct.amount);
    // acct.changeAmount(-acct.getAmount());
        
        
        System.out.println(acct.getAmount());
    }
}
