package Chapter_1_Fundamentals.Section_1_BasicProgrammingModel;

import edu.princeton.cs.algs4.StdArrayIO;

/* Exercise 1.1.15

Output:

1
        1
2
        1         2
3
        1         2         3
4
        1         2         3         4
5
        1         2         3         4         0
 */

public class Exercise15 {
    public static void main(String[] args) {
        int[] test = {1, 2, 2, 3, 3, 3, 4, 4, 4, 4};

        StdArrayIO.print(histogram(test, 1));
        StdArrayIO.print(histogram(test, 2));
        StdArrayIO.print(histogram(test, 3));
        StdArrayIO.print(histogram(test, 4));
        StdArrayIO.print(histogram(test, 5));

    }

    private static int[] histogram(int[] a, int m) {
        int[] result = new int[m];

        for(int i : a) {
            if (i - 1 < m && i - 1 >= 0) result[i - 1]++;
        }

        return result;
    }
}
