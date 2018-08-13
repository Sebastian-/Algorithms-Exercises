package Chapter_1_Fundamentals.Section_1_BasicProgrammingModel;

/* Exercise 1.1.2

    a. (1 + 2.236)/2 -> 1.618 which is of type double
    b. 1 + 2 + 3 + 4.0 -> 10.0 which is of type double
    c. 4.1 >= 4 -> true which is of type boolean
    d. 1 + 2 + "3" -> "33" which is of type string
 */

import edu.princeton.cs.algs4.StdOut;

public class Exercise2 {
    public static void main(String[] args) {
        StdOut.println((1 + 2.236)/2);
        StdOut.println(1 + 2 + 3 + 4.0);
        StdOut.println(4.1 >= 4);
        StdOut.println(1 + 2 + "3");
    }
}
