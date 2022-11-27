import edu.princeton.cs.algs4.Insertion;
import edu.princeton.cs.algs4.StdOut;

import java.util.Scanner;

public class StringSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String[] a = str.split(" ");
        Insertion.sort(a);
        for (String s : a) StdOut.print(s + " ");
    }
}
