package Chapter_1_Fundamentals.Section_1_BasicProgrammingModel;

import edu.princeton.cs.algs4.StdOut;

/* Exercise 1.1.19

Assuming a computer can make 1e9 computations a second,
and finding the Nth fibonacci number takes 1.618^(N-1) computations
(see https://stackoverflow.com/questions/360748/computational-complexity-of-fibonacci-sequence)
the largest value of N which can be calculated in an hour is roughly 60.

Running the program on my laptop for 20 minutes I was able to reach 54, which suggests a maximum
of 55 in under an hour.
 */

public class Exercise19 {
    private static long fibonacci(int n) {
        if(n == 0) return 0;
        if(n == 1) return 1;
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    private  static long betterFibonacci(int n) {
        if(n <= 1) return n;

        long[] fib = new long[n + 1];
        fib[0] = 0;
        fib[1] = 1;
        for(int i = 2; i <= n; i++) {
            fib[i] = fib[i - 1] + fib[i - 2];
        }

        return fib[n];
    }

    public static void main(String[] args) {
        for(int n = 0; n < 90; n++) {
            StdOut.println(n + " " + betterFibonacci(n));
        }
    }
}
