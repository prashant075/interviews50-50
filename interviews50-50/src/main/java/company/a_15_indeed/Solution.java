package company.a_15_indeed;

/*
You are working on a logic game made up of a series of puzzles. The first type of puzzle you settle on is "sub-Sudoku", a game where the player has to position the numbers 1..N on an NxN matrix.

Your job is to write a function that, given an NxN matrix, returns true if  every row and column contains the numbers 1..N

The UI for the game does not do any validation on the numbers the player enters, so the matrix can contain any signed integer.

grid1 = [[2, 3, 1], 6
         [1, 2, 3],
         [3, 1, 2]]            -> True
          6
grid2 = [[1, 2, 3], 6
         [3, 2, 1],
         [3, 1, 2]]            -> False
          7
grid3 = [[2, 2, 3],
         [3, 1, 2],
         [2, 3, 1]]            -> False

grid4 = [[1]]                  -> True

grid5 = [[-1, -2, -3],
         [-2, -3, -1],
         [-3, -1, -2]]         -> False

grid6 = [[1, 3, 3],
         [3, 1, 2],
         [2, 3, 1]]            -> False

grid7 = [[1, 2, 3, 4],
         [4, 3, 2, 1],
         [1, 3, 2, 4],
         [4, 2, 3, 1]]         -> False
         [1,2,3,4]

grid8 = [[0, 3],
         [3, 0]]               -> False

grid9 = [[0, 1],
         [1, 0]]               -> False

grid10 = [[0, 2],3
          [2, 0]]              -> False

grid11 = [[1, 2, 3, 4],
          [2, 3, 1, 4],
          [3, 1, 2, 4],
          [4, 2, 3, 1]]        -> False

grid12 = [[-1, -2, 12, 1],
          [12, -1, 1, -2],
          [-2, 1, -1, 12],
          [1, 12, -2, -1]]     -> False

grid13 = [[2, 3, 3], 8
          [1, 2, 1],
          [3, 1, 2]]           -> False

grid14 = [[1, 3],              -> False
          [3, 1]]

validateSudoku(grid1) => True
validateSudoku(grid2) => False
validateSudoku(grid3) => False
validateSudoku(grid4) => True
validateSudoku(grid5) => False
validateSudoku(grid6) => False
validateSudoku(grid7) => False
validateSudoku(grid8) => False
validateSudoku(grid9) => False
validateSudoku(grid10) => False
validateSudoku(grid11) => False
validateSudoku(grid12) => False
validateSudoku(grid13) => False
validateSudoku(grid14) => False

Complexity analysis variables:

N = The number of rows/columns in the matrix

[[2, 3, 1], 6
  [1, 2, 3],
 [3, 1, 2]]            -> True
          6
[1, 2, 3, 4],
         [4, 3, 2, 1],
         [1, 3, 2, 4],
         [4, 2, 3, 1]]         -> False
         [1,2,3,4]
*/

import java.io.*;
import java.util.*;

public class Solution {
    //
    public static boolean isValidMatrix(int[][] grid){
        Set<String> columnSet = new HashSet<>();
        Set<String> rowSet = new HashSet<>();
        //  System.out.println(rowSet);
        int range = grid.length;
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j]>range || grid[i][j] <=0) return false;
                String rowVal = i+"row"+grid[i][j];
                String colVal = j+"col"+grid[i][j];
                // System.out.println(rowVal);
                //  System.out.println(colVal);
                if(!rowSet.isEmpty() && rowSet.contains(rowVal)) return false;
                if(!columnSet.isEmpty() && columnSet.contains(colVal)) return false;
                rowSet.add(rowVal);
                columnSet.add(colVal);
            }
        }
        // System.out.println(rowSet);
        //System.out.println(columnSet);

        return true;
    }

    public static void main(String[] argv) {
        int[][] grid1 = {
                {2, 3, 1},
                {1, 2, 3},
                {3, 1, 2},
        };

        int[][] grid100 = {
                {2, 1},
                {1, 2}
        };
        int[][] grid2 = {
                {1, 2, 3},
                {3, 2, 1},
                {3, 1, 2},
        };
        int[][] grid3 = {
                {2, 2, 3},
                {3, 1, 2},
                {2, 3, 1},
        };
        int[][] grid4 = {
                {1},
        };
        int[][] grid5 = {
                {-1, -2, -3},
                {-2, -3, -1},
                {-3, -1, -2},
        };
        int[][] grid6 = {
                {1, 3, 3},
                {3, 1, 2},
                {2, 3, 1},
        };
        int[][] grid7 = {
                {1, 2, 3, 4},
                {4, 3, 2, 1},
                {1, 3, 2, 4},
                {4, 2, 3, 1},
        };
        int[][] grid8 = {
                {0, 3},
                {3, 0},
        };
        int[][] grid9 = {
                {0, 1},
                {1, 0},
        };
        int[][] grid10 = {
                {0, 2},
                {2, 0},
        };
        int[][] grid11 = {
                {1, 2, 3, 4},
                {2, 3, 1, 4},
                {3, 1, 2, 4},
                {4, 2, 3, 1},
        };
        int[][] grid12 = {
                {-1, -2, 12, 1},
                {12, -1, 1, -2},
                {-2, 1, -1, 12},
                {1, 12, -2, -1},
        };
        int[][] grid13 = {
                {2, 3, 3},
                {1, 2, 1},
                {3, 1, 2},
        };
        int[][] grid14 = {
                {1, 3},
                {3, 1},
        };
        System.out.println(isValidMatrix(grid14));
    }
}

/*
validateSudoku(grid3) => False
validateSudoku(grid4) => True
validateSudoku(grid5) => False
validateSudoku(grid6) => False
validateSudoku(grid7) => False
validateSudoku(grid8) => False
validateSudoku(grid9) => False
validateSudoku(grid10) => False
validateSudoku(grid11) => False
validateSudoku(grid12) => False
validateSudoku(grid13) => False
validateSudoku(grid14) => False
*/
