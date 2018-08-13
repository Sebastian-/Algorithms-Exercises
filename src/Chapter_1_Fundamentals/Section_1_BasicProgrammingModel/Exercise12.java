package Chapter_1_Fundamentals.Section_1_BasicProgrammingModel;

/* Exercise 1.1.12

Output:

0
1
2
3
4
4
3
2
1
0

 */

public class Exercise12 {
    public static void main(String[] args) {
        int[] a = new int[10];

        for(int i = 0; i < 10; i++) {
            a[i] = 9 - i;
        }

        for(int i = 0; i < 10; i++) {
            a[i] = a[a[i]];
        }

        for(int i = 0; i < 10; i++) {
            System.out.println(a[i]);
        }
    }
}
