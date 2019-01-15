/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question.question_130_140;

/**
 *
 * @author Moe
 */
public class q137 {

    public static void main(String[] args) {
        char[][] grid = new char[3][3];
        grid[1][1] = 'X';
        grid[0][0] = 'O';
        grid[2][1] = 'X';
        grid[0][1] = 'O';
        grid[2][2] = 'X';
        grid[1][2] = 'O';
        grid[2][0] = 'X';

    }
}
/**         0   1    2
 *          I   II   III
 *      --|---|----|----
 *    0  I| O |  O | 
 *      --|---|----|----
 *    1 II|   |  X |  O
 *      --|---|----|----
 *    2 II| X |  X |  X
 *      --|---|----|----
 * 
 * 
 * 
 */