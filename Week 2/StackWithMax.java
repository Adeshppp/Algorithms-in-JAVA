import java.util.*;

public class StackWithMax {
    private static ListNode head = null;

    static class ListNode {
        int val;
        ListNode next;

        ListNode(int val) {
            this.val = val;
            this.next = null;
        }
    }

    public static void main(String[] args) {
        push(25);
        push(10);
        push(15);
        print();
        pop();
        print();
        pop();
        print();
        pop();
        print();
        System.out.println("Exit!!!");
    }

    public static void print() {
        ListNode temp = head;
        while (temp != null) {
            System.out.print(temp.val + " ");
            temp = temp.next;
        }
        System.out.println();

    }


    public static void push(int n) {
        ListNode newNode = new ListNode(n);
        newNode.next = head;
        head = newNode;
    }

    public static void pop() {
        if (head == null) return;
        int max = head.val;
        ListNode n1 = head;
        ListNode n0 = new ListNode(-1);
        ListNode temp = n0;
        n0.next = head;

        while (n1.next != null) {
            if (max < n1.next.val) {
                max = n1.next.val;
                n0 = n1;
            }
            n1 = n1.next;
        }
        if (max == head.val) head = head.next;
        else n0.next = n1.next;

        System.out.println(max);

    }

}
