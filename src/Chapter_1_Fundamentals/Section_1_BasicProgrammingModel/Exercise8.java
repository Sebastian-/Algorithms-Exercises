package Chapter_1_Fundamentals.Section_1_BasicProgrammingModel;

/* Exercise 1.1.8

    a. "b" -> a single character is cast into a string and displayed as expected
    b. "197" -> concatenation with + is only defined for Strings. Characters are cast to their
    ASCII integer values and added together instead.
    c. "e" -> the expression ('a' + 4) results in 101, which cast into a char corresponds to
    'e', the fourth character in the alphabet from a.
 */

public class Exercise8 {
    public static void main(String[] args) {
        // Part a
        System.out.println('b');

        //Part b
        System.out.println('b' + 'c');

        // Part c
        System.out.println((char) ('a' + 4));
    }
}
