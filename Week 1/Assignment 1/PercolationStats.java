import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.StdRandom;
import edu.princeton.cs.algs4.StdStats;

public class PercolationStats {
    private static final double CONFINDENCE_95 = 1.96;
    private final int experimentsCount;
    private final double[] fractions;

    public PercolationStats(int n, int trials) {
        if (n <= 0 || trials <= 0) {
            throw new IllegalArgumentException();
        }
        experimentsCount = trials;
        fractions = new double[experimentsCount];
        for (int expNum = 0; expNum < experimentsCount; expNum++) {
            Percolation pr = new Percolation(n);
            int openedSites = 0;
            while (!pr.percolates()) {
                int i = StdRandom.uniformInt(1, n + 1);
                int j = StdRandom.uniformInt(1, n + 1);
                if (!pr.isOpen(i, j)) {
                    pr.open(i, j);
                    openedSites++;
                }
            }
            double fraction = (double) (openedSites / (n * n));
            fractions[expNum] = fraction;
        }
    }

    public double mean() {
        return StdStats.mean(fractions);
    }

    public double stddev() {
        return StdStats.stddev(fractions);
    }

    public double confidenceLo() {
        return mean() - ((CONFINDENCE_95 * stddev()) / Math.sqrt(experimentsCount));
    }

    public double confidenceHi() {
        return mean() + ((CONFINDENCE_95 * stddev()) / Math.sqrt(experimentsCount));
    }

    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        int trials = Integer.parseInt(args[1]);
        PercolationStats ps = new PercolationStats(n, trials);
        String confidence = ps.confidenceLo() + "," + ps.confidenceHi();
        StdOut.println("mean=" + ps.mean());
        StdOut.println("stddev=" + ps.stddev());
        StdOut.println("95% confidence interval=" + confidence);
    }
}
