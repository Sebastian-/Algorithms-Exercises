package Chapter_1_Fundamentals.Section_1_BasicProgrammingModel;

import edu.princeton.cs.algs4.StdOut;

/* Exercise 1.1.20

Output:
0.0
0.6931471805599453
1.791759469228055
3.1780538303479453
4.787491742782046

 */

public class Exercise20 {
    private static double lnFactorial(int n) {
        if(n == 1) return 0;
        // using the fact that log(n * (n-1) * (n-2) * ... * 1) = log(n) + log(n-1) + ... + 0
        return Math.log(n) + lnFactorial(n - 1);
    }

    public static void main(String[] args) {
        StdOut.println(lnFactorial(1));
        StdOut.println(lnFactorial(2));
        StdOut.println(lnFactorial(3));
        StdOut.println(lnFactorial(4));
        StdOut.println(lnFactorial(5));
    }
}
