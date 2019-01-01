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
public class Q48 {

    public static void main(String[] args) {
//        String[][] arr = {{"A", "B", "C"}, {"D", "E"}};
//        for (int i = 0; i < arr.length; i++) {
//            for (int j = 0; j < arr[i].length; j++) {
//                System.out.println(arr[i][j] + " ");
//                if (arr[i][j].equals("B")) {
//                    break;
//                }
//            }
//            continue;
//        }

        String[][] arr = {{"A", "B", "C", "X"}, {"D", "E", "F"}, {"G", "I", "J"}};
        String[] testArr = {"T", "K", "Z"};

        int tmp = arr.length;
        int tmp2 = testArr.length;

        System.out.println(tmp);
        System.out.println(tmp2);

        for (int i = 0; i < arr.length; i++) {

            for (int j = 0; j < arr[i].length; j++) {
                System.out.println(arr[j][i] + " ");
            }
        }
    }
}
