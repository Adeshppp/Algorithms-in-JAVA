import java.util.Scanner;

public class QuickUnionUF {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        SolPath s = new SolPath(n);
        while (true) {
            System.out.println("enter 1 if want to call union function and 2 if want to check whether elements are connected or not and 3 to print an array and 4 to exit: ");
            int l = sc.nextInt();
            if (l == 1) {
                System.out.print("Enter 2 elements between 0 to " + n);
                System.out.print(" : ");
                int a = sc.nextInt();
                int b = sc.nextInt();
                s.union(a, b);
            } else if (l == 2) {
                System.out.print("Enter 2 elements between 0 to " + n);
                System.out.print(" : ");
                int a = sc.nextInt();
                int b = sc.nextInt();
                System.out.println(s.connected(a, b));

            } else if (l == 3) {
                s.print();
            } else if (l == 4) {
                System.out.print("We made it!!!");
                break;
            } else System.out.print("Please enter valid option!");

        }
    }
}

class Solu {
    private int id[];

    public Solu(int N) {
        id = new int[N];
        for (int i = 0; i < id.length; i++) {
            id[i] = i;
        }
    }

    private int root(int i) {
        while (id[i] != i) {
            i = id[i];
        }
        return i;
    }

    public boolean connected(int p, int q) {
        return root(p) == root(q);
    }

    public void union(int p, int q) {
        int a = root(p);
        int b = root(q);
        id[a] = b;
    }

    public void print() {
        for (int j : id) {
            System.out.print(j + " ");
        }
        System.out.println();
    }
}
