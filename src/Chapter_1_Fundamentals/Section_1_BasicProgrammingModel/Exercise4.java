package Chapter_1_Fundamentals.Section_1_BasicProgrammingModel;

/* Exercise 1.1.4

    a. if(a > b) then c = 0;
        Results in an error: "variable declaration not allowed here"
        The keyword "then" is not recognized by Java like it is in other programming languages.
    b. if a > b { c = 0; }
        Results in an error: "( expected"
        The condition of an if statement must be wrapped in parentheses.
    c. if(a > b) c = 0;
        Perfectly valid. Braces can be omitted around a block of statements in a conditional or
        loop if it only contains one statement.
    d. if(a > b) c = 0 else b = 0;
        Results in an error: "; expected"
        An if-else expression is not a single statement in Java. A semicolon is required after
        the assignment to c.
 */

public class Exercise4 {

    void statements() {
        int a = 1;
        int b = 2;
        int c = 3;

        // if(a > b) then c = 0;
        // if a > b { c = 0; }
        if(a > b) c = 0;
        // if(a > b) c = 0 else b = 0;
    }
}
