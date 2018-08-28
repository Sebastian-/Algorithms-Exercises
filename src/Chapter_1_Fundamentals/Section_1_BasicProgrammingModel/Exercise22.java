package Chapter_1_Fundamentals.Section_1_BasicProgrammingModel;

import edu.princeton.cs.algs4.StdOut;

public class Exercise22 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 8, 10, 15, 20};
        BinarySearch(arr, 1);
    }

    private static int BinarySearch(int[] a, int key) {
        return indexOf(a, key, 0, a.length - 1, 0);
    }

    private static int indexOf(int[] a, int key, int lo, int hi, int depth) {
        StdOut.println(depth + " -- lo: " + lo + " hi: " + hi);
        if (lo > hi) return -1;
        int mid = (lo + hi)/2;
        if (key < a[mid]) return indexOf(a , key, lo, mid - 1, depth + 1);
        else if (key > a[mid]) return indexOf(a, key, mid + 1, hi, depth + 1);
        else return mid;
    }
}
