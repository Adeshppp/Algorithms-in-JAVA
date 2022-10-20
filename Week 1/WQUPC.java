import java.util.Scanner;

public class WQUPC {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        WSol s = new WSol(n);
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
            } else if (l == 5) {
                int i = sc.nextInt();
                int j = sc.nextInt();
                s.index(i, j);
            } else System.out.print("Please enter valid option!");

        }
    }
}

class WSol {
    private int id[];
    private int sz[];

    public WSol(int N) {
        id = new int[N];
        sz = new int[N];
        for (int i = 0; i < id.length; i++) {
            id[i] = i;
            sz[i] = 1;
        }
    }

    private int root(int i) {
        while (id[i] != i) {
            id[i] = id[id[i]];
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
        if (a == b) return;
        if (sz[a] < sz[b]) {
            id[a] = b;
            sz[b] += sz[a];
        } else {
            id[b] = a;
            sz[a] += sz[b];
        }
//        id[a] = b;
    }

    void index(int i, int j) {
        System.out.print(sz[i] + " " + sz[j]);
    }

    public void print() {
        for (int j : id) {
            System.out.print(j + " ");
        }
        System.out.println();
    }
}

