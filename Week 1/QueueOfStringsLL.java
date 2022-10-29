import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

import java.util.Objects;

public class QueueOfStringsLL {
    ListNode head;
    int no = 0;
    private int size;

    QueueOfStringsLL() {
        this.size = 0;
    }

    public class ListNode {
        String val;
        ListNode next;

        ListNode() {
            this.val = null;
        }

        ListNode(String val) {
            this.val = val;
            this.next = null;
            size++;
        }

        ListNode(String val, ListNode next) {
            this.val = val;
            this.next = next;
            size++;
        }

    }

    public static void main(String[] args) {
        QueueOfStringsLL queue = new QueueOfStringsLL();

//        while (!StdIn.isEmpty()) {
//            String s = StdIn.readString();
//            if (s.equals("-")) queue.pop();
//            else queue.push(s);
//        }
        int s = 1;

        StdOut.println("Enter command like push adesh to push 'adesh' into the stack and write pop to remove element from stack and enter exit to exit");
//        while (true) {
//            String ele = "";
//            String cmd = StdIn.readString();
//
//            if (Objects.equals(cmd, "push")) {
//                ele = StdIn.readString();
//                queue.push(ele);
//
//            } else if (Objects.equals(cmd, "pop")) queue.pop();
//            else if (Objects.equals(cmd, String.valueOf(s))) break;
//
//        }
        while (true) {
            String str = StdIn.readString();
            if (Objects.equals(str, "push")) queue.push(StdIn.readString());
            else if (Objects.equals(str, "pop")) queue.pop();
            else if (Objects.equals(str, "print")) queue.print();
        }
    }

    ListNode first = null;

    public void push(String val) {
        System.out.println("no at the push before pushing: " + no);

        no++;

        ListNode n1 = new ListNode(val, first);

        first = n1;
        head = n1;
        System.out.println("no: " + no + " Pushing : " + n1.val);

    }

    ListNode tempprev = null;

    public void pop() {
        if (head == null) {
            System.out.println("Queue is empty");
            return;
        }
        ListNode temp = new ListNode();
        head = first;
        temp.next = head;
        int n = 0;
        while (temp.next != null) {
            n++;
            System.out.println(n + " : " + temp.next.val + " ");

            if (temp.next.next == null) {
                System.out.println("Entrance of if .....");
                tempprev = temp;
                temp = temp.next;
                break;
            }
            temp = temp.next;

        }

        System.out.println("no: " + no + " popping: " + temp.val);
        no--;
        System.out.println("no after popping: " + no);
        System.out.println("first pointing to: " + first.val);
        tempprev.next = null;

        temp = first;
        if (no == 0) head = null;
        else head = temp;


//        ListNode temp = point;

        
    }

    public void print() {
        ListNode temp1 = head;
        while (temp1 != null) {
            System.out.print(temp1.val + " ");
            temp1 = temp1.next;
        }
        System.out.println();
        System.out.println("first pointing to: " + first.val);
    }


}
