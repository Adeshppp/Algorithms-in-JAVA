import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

public class StackOfStrings {
    ListNode head;
    private int size;

    StackOfStrings() {
        this.size = 0;
    }

    public class ListNode {
        String val;
        ListNode next;

        ListNode() {
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
        StackOfStrings stack = new StackOfStrings();
        StdOut.print("Enter the string: ");
        while (!StdIn.isEmpty()) {
            String s = StdIn.readString();
            if (s.equals("-")) StdOut.print(stack.pop() + " ");
            else stack.push(s);
        }
    }

    public String pop() {
        String output = "";
        if (head == null) StdOut.print("Stack is empty.");

        else {
            ListNode out = head;
            head = head.next;
            size--;
            output = out.val;
        }
        return output;
    }

    public void push(String s) {
        ListNode add = new ListNode(s);
        add.next = head;
        head = add;
    }
}


