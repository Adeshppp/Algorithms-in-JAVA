import edu.princeton.cs.algs4.Insertion;
import edu.princeton.cs.algs4.StdRandom;

public class SortExp {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        Double[] a = new Double[n];
        for (int i = 0; i < n; i++) a[i] = StdRandom.uniformDouble();
        Insertion.sort(a);
        for (int i = 0; i < n; i++) System.out.println(a[i]);
    }
}
