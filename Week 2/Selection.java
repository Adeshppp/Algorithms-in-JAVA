public class Selection implements Comparable<Selection> {
    public static void sort(Comparable[] a) {
        int N = a.length;
        for (int i = 0; i < N; i++) {
            int min = i;
            for (int j = i + 1; j < N; j++) if (less(a, j, min)) min = j;
            exch(a, i, min);
        }
    }

    public static boolean less(Comparable[] a, int j, int min) {
        return a[j].compareTo(a[min]) > 0;
    }

    public static void exch(Comparable[] a, int i, int min) {
        int temp = (int) a[i];
        a[i] = a[min];
        a[min] = temp;
    }

    public int compareTo(Selection o) {
        return 0;
    }
}
