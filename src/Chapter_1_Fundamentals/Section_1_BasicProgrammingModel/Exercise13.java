package Chapter_1_Fundamentals.Section_1_BasicProgrammingModel;

import edu.princeton.cs.algs4.StdOut;

public class Exercise13 {
    public static void main(String[] args) {
        int[][] matrix = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12}
        };

        printMatrixTranspose(matrix);
    }

    private static void printMatrixTranspose(int[][] matrix) {
        for(int col = 0; col < matrix[0].length; col++) {
            for(int row = 0; row < matrix.length; row++) {
                StdOut.printf("%3d", matrix[row][col]);
            }
            StdOut.println();
        }
    }
}
