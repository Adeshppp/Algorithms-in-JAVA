import java.util.Scanner;

public class StackOfStringsArray {
    public static int n = 16;
    public static int no = -1;

    public static String[] arr = new String[n];

    public static void main(String[] args) {

        StringBuilder a = new StringBuilder();
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
//      String s = "My name - - is - adesh";

        if (!Character.toString(s.charAt(s.length() - 1)).equals(" ")) s += " ";
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(0) == '-') {
                System.out.print("stack is empty!!!");
                
                continue;
            }
            if (s.charAt(i) == '-') {
                pop();
                i++;
                no--;
                continue;
            }
            if (s.charAt(i) == ' ' || i == s.length() - 1) {
                no++;
                push(String.valueOf(a));
                a = new StringBuilder();
                continue;
            }
            a.append(Character.toString(s.charAt(i)));
        }
        print();
    }

    public static void push(String s) {
        arr[no] = s;
        System.out.println(no + " : " + arr[no] + " ");
    }

    public static void pop() {
        System.out.println(no + " popping: " + arr[no] + " ");
        arr[no] = null;
    }

    public static void print() {
        System.out.print("Printing array: ");
        for (int i = 0; i < 16; i++) {
            if (arr[i] == null) break;
            System.out.print(arr[i] + " ");
        }
    }


}
