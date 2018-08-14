package Chapter_1_Fundamentals.Section_1_BasicProgrammingModel;

import edu.princeton.cs.algs4.StdOut;

/* Exercise 1.1.19

The authors have a sense of humor :p
This program will never terminate in a reasonable amount of time
 */

public class Exercise19 {
    private static long fibonacci(int n) {
        if(n == 0) return 0;
        if(n == 1) return 1;
        return fibonacci(n - 1) + fibonacci(n - 2);
    }
    public static void main(String[] args) {
        for(int n = 0; n < 90; n++) {
            StdOut.println(n + " " + fibonacci(n));
        }
    }
}
