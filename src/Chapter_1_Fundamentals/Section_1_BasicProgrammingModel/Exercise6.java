package Chapter_1_Fundamentals.Section_1_BasicProgrammingModel;

import edu.princeton.cs.algs4.StdOut;

/* Exercise 1.1.6

The program prints a sequence where each value is the sum of the previous two values (starting
with 0, 1)

0
1
1
2
3
5
8
13
21
34
55
89
144
233
377
610

 */

public class Exercise6 {
    public static void main(String[] args) {
        int f = 0;
        int g = 1;
        for(int i = 0; i <= 15; i++) {
            StdOut.println(f);
            f = f + g;
            g = f - g;
        }
    }
}
