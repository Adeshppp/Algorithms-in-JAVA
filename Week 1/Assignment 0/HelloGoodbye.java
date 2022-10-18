import java.util.Scanner;

public class HelloGoodbye {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] arr = new String[2];
        for (int i = 0; i < 2; i++) {
            arr[i] = sc.next();
        }
        System.out.print("Hello ");
        for (int i = 0; i < 2; i++) {
            System.out.print(arr[i]);
            if (i == 0) System.out.print(" and ");
            else System.out.println(".");
        }

        System.out.print("Goodbye ");
        for (int i = 1; i >= 0; i--) {
            System.out.print(arr[i]);
            if (i == 1) System.out.print(" and ");
            else System.out.print(".");
        }
    }
}
