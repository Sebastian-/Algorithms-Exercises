package Chapter_1_Fundamentals.Section_1_BasicProgrammingModel;

import edu.princeton.cs.algs4.StdOut;

/* Exercise 1.1.14

Output:
0
1
1
2
2
2
2
3

 */

public class Exercise14 {
    public static void main(String[] args) {
        StdOut.println(lg(1));
        StdOut.println(lg(2));
        StdOut.println(lg(3));
        StdOut.println(lg(4));
        StdOut.println(lg(5));
        StdOut.println(lg(6));
        StdOut.println(lg(7));
        StdOut.println(lg(8));
    }

    private static int lg(int n) {
        int result = 0;

        while(n/2 > 0) {
            result++;
            n = n/2;
        }

        return result;
    }
}
