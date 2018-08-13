package Chapter_1_Fundamentals.Section_1_BasicProgrammingModel;

import edu.princeton.cs.algs4.StdOut;

/* Exercise 1.1.7

    a. 3.00009
    b. 1023
    c. 10000

 */

public class Exercise7 {
    public static void main(String[] args) {

        // Part a
        double t = 9.0;
        while (Math.abs(t - 9.0/t) > 0.001)
            t = (9.0/t + t)/2.0;
        StdOut.printf("%.5f\n", t);

        //Part b
        int sum = 0;
        for(int i = 1; i < 1000; i *= 2)
            for(int j = 0; j < i; j++)
                sum++;
        StdOut.println(sum);

        // Part c
        sum = 0;
        for(int i = 1; i < 1000; i *= 2)
            for(int j = 0; j < 1000; j++)
                sum++;
        StdOut.println(sum);
    }
}
