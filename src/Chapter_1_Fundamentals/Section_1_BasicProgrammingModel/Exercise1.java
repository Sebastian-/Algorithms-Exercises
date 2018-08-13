package Chapter_1_Fundamentals.Section_1_BasicProgrammingModel;

/* Exercise 1.1.1

    a. (0 + 15) / 2 = 7
    b. 2.0e-6 * 100000000.1 = 200.0000002
    c. true && false || true && true = true
 */

import edu.princeton.cs.algs4.StdOut;

public class Exercise1 {
    public static void main(String[] args) {
        StdOut.println((0 + 15) / 2);
        StdOut.println(2.0e-6 * 100000000.1);
        StdOut.println(true && false || true && true);
    }
}
