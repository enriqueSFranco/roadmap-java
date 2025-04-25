package org.example.tips;

import java.util.Arrays;

public class MatrixTips {
    public static void printMatrix(int[][] matrix) {
        for(int[] row : matrix)
            System.out.println(Arrays.toString(row));
    }

    public void createAndPrintMatrix() {
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        System.out.println("Original matrix:");
        printMatrix(matrix);
    }
}
