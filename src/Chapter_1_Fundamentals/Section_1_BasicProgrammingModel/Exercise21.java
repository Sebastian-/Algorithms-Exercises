package Chapter_1_Fundamentals.Section_1_BasicProgrammingModel;

import edu.princeton.cs.algs4.StdArrayIO;
import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

import java.util.ArrayList;
import java.util.List;

public class Exercise21 {
    public static void main(String[] args) {
        StdOut.println("Input lines with a name and two integers. Enter twice to generate the table");
        List<String> rawInput = new ArrayList<>();

        while(StdIn.hasNextLine()) {
            String row = StdIn.readLine();
            if (row.matches("")) break;
            if (row.matches("\\w+\\s+\\d+\\s+\\d+")) {
                rawInput.add(row);
            } else {
                StdOut.println("Invalid input. Input a string and two integers separated by spaces.");
            }
        }

        for(String row : rawInput) {
            String[] rowData = row.split(" ");
            printTableRow(rowData[0],
                          Double.parseDouble(rowData[1]),
                          Double.parseDouble(rowData[2]));
        }
    }

    private static void printTableRow(String s, double a, double b) {
        StdOut.printf("%10s%20.3f%n", s, a/b);
    }
}
