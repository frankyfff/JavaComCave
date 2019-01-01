/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package klausur.fragen.b051_b100;

/**
 *
 * @author Moe
 */
public class Q55 {

    public static void main(String[] args) {
        int iVar = 100;
        float fVar = 100.100f;
        double dVar = 123;

//    iVar = fVar;
        fVar = iVar;
        dVar = fVar;
//        fVar = dVar;
        dVar = iVar;
//        iVar = dVar;
    }

}
