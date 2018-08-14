package Chapter_1_Fundamentals.Section_1_BasicProgrammingModel;

import edu.princeton.cs.algs4.StdOut;

/* Exercise 1.1.18

Using addition ================================================================

mystery(int a, int b) {
    if(b == 0) return 0;
    if(b % 2 == 0) return additionMystery(a + a, b/2);
    return additionMystery(a + a, b/2) + a;
}

mystery(2, 25) and mystery(3, 11) evaluate to 50 and 33 respectively
mystery(a, b) evaluates to a * b

Using multiplication ==========================================================

mystery(int a, int b) {
    if(b == 0) return 1;
    if(b % 2 == 0) return multiplicationMystery(a * a, b/2);
    return multiplicationMystery(a * a, b/2) * a;
}

mystery(2, 25) and mystery(3, 11) evaluate to 33554432 and 177147 respectively
mystery(a, b) evaluates to a^b

 */

public class Exercise18 {
    public static void main(String[] args) {
        StdOut.println("addition mystery:");
        StdOut.println("mystery(2, 25): " + additionMystery(2,25));
        StdOut.println("mystery(3, 11): " + additionMystery(3,11));
        StdOut.println("multiplication mystery:");
        StdOut.println("mystery(2, 25): " + multiplicationMystery(2,25));
        StdOut.println("mystery(3, 11): " + multiplicationMystery(3, 11));

    }

    private static int additionMystery(int a, int b) {
        if(b == 0) return 0;
        if(b % 2 == 0) return additionMystery(a + a, b/2);
        return additionMystery(a + a, b/2) + a;
    }

    private static int multiplicationMystery(int a, int b) {
        if(b == 0) return 1;
        if(b % 2 == 0) return multiplicationMystery(a * a, b/2);
        return multiplicationMystery(a * a, b/2) * a;
    }
}
