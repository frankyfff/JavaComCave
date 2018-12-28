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
public class Q120 {
    public static void main(String[] args) {
//        Test t1 = new Test();
//        t1.var = 300;
//        System.out.println(t1);
//        
//        Test t2 = new Test();
//        t2.stVar = 300;
//        System.out.println(t2);

           TestingToString tts = new TestingToString();
           
           String tmp = tts.toString();
           System.out.println(tmp);
    }
}

class Test {

    public static int stVar = 100;
    public int var = 200;

    public String toString() {
        return var + " : " + stVar;
    }
    
    Object object = new Object();
   
}

class TestingToString {

    String tmp = "Monir";
    
//    public String toString(){
//        return tmp;
//    }

}
