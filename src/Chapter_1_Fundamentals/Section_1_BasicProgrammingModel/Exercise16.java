package Chapter_1_Fundamentals.Section_1_BasicProgrammingModel;

import edu.princeton.cs.algs4.StdOut;

/* Exercise 1.1.16

Output:
311361142246
 */

public class Exercise16 {
    public static void main(String[] args) {
        StdOut.println(exR1(6));
    }

    private static String exR1(int n) {
        if(n <= 0) return "";
        return exR1(n-3) + n + exR1(n - 2) + n;
    }
}
