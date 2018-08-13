package Chapter_1_Fundamentals.Section_1_BasicProgrammingModel;

import edu.princeton.cs.algs4.StdOut;

/* Exercise 1.1.11

Output:

 123
1**
2 **
3*
4
 */

public class Exercise11 {
    public static void main(String[] args) {
        boolean[][] testArray = {
                {true, true, false},
                {false, true, true},
                {true, false, false},
                {false, false, false}
        };

        print2DBooleanArray(testArray);
    }

    private static void print2DBooleanArray(boolean[][] array) {
        for(int row = 0; row < array.length + 1; row++) {
            StringBuilder rowOutput = new StringBuilder();

            for(int col = 0; col < array[0].length + 1; col++) {
                if(row == 0 && col == 0) {
                    rowOutput.append(" ");
                } else if (row == 0) {
                    rowOutput.append(col);
                } else if(col == 0) {
                    rowOutput.append(row);
                } else {
                    rowOutput.append(array[row-1][col-1] ? "*" : " ");
                }
            }

            StdOut.println(rowOutput.toString());
        }
    }
}
