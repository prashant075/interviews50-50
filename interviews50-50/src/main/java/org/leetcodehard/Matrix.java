package org.leetcodehard;

import java.io.IOException;
import java.util.Scanner;

public class Matrix {
        public static void main(String[] args) throws IOException
        {
            Scanner sc = new Scanner(System.in);
            int [] [] matrix =null;
                String [] len =  sc.nextLine().split(" ");
                int row = Integer.parseInt(len[0]);
                int col = Integer.parseInt(len[1]);
                  matrix = new int[row][col];
                for(int i=0;i<row;i++){
                    String [] eachrow =  sc.nextLine().split(" ");
                    for(int j=0;j<col;j++){
                        matrix[i][j]=Integer.parseInt(eachrow[j]);
                    }
                }
            printMatrix(matrix);
            removeZeroRowCol(matrix);
            print(matrix);


        }

        static void printMatrix(int[][] matrix){
            for(int i=0;i<matrix.length;i++){
                for(int j=0;j<matrix[0].length;j++){
                    System.out.print(matrix[i][j]+" ");
                }
                System.out.println();
            }
        }

    static void print(int[][] A)
    {
        int i = 0, j = 0, m = 0, n = 0;
        m = A.length;

        if (m != 0)
            n = A[0].length;

        // Taking a flag which helps us in printing
        // the matrix because if we found that the above
        // row is contain only zero then we won't go to next
        // line otherwise there will be space between
        // two consecutive rows
        boolean flag = false;

        // Iterating over matrix
        for (i = 0; i < m; i++) {
            for (j = 0; j < n; j++) {
                if (A[i][j] != -1) {
                    System.out.print(A[i][j]+" ");

                    // Making flag true if row get
                    // printed
                    flag = true;
                }
            }

            // If row got printed then moving to the
            // next line
            if (flag) {
                System.out.println();
                flag = !flag;
            }
        }
    }
    static void removeZeroRowCol(int[][] A)
    {

        int i = 0, j = 0, m = A.length, n = 0;

        if (m != 0)
            n = A[0].length;

        // Traversing by row
        for (i = 0; i < m; i++) {
            for (j = 0; j < n; j++) {

                // If found that the complete row do
                // not contain only zeros
                if (A[i][j] == 1)
                    break;
            }

            // If found that the complete row
            // contain zero
            if (j == n) {
                for (j = 0; j < n; j++)
                    A[i][j] = -1;
            }
        }

        // Traversing by column
        for (i = 0; i < m; i++) {
            for (j = 0; j < n; j++) {

                // If found that the complete column
                // do not contain all zeros
                if (A[j][i] == 1)
                    break;
            }

            // If found that the complete column
            // contain only zeros
            if (j == n) {
                for (j = 0; j < n; j++)
                    A[j][i] = -1;
            }
        }
    }
}
