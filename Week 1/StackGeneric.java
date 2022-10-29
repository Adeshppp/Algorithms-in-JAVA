import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

class StackGenerics<Item> {
    //    private final ListNode first = null;
    ListNode head;
    private int size;

    StackGenerics() {
        this.size = 0;
    }

    public class ListNode {
        Item val;
        ListNode next;

        ListNode() {
        }

        ListNode(Item val) {
            this.val = val;
            this.next = null;
            size++;
        }

        ListNode(Item val, ListNode next) {
            this.val = val;
            this.next = next;
            size++;
        }


    }


    public Item pop() {
        Item output = null;
        if (head == null) StdOut.print("Stack is empty.");

        else {
            ListNode out = head;
            head = head.next;
            size--;
            output = out.val;
        }
        return output;
    }

    public void push(Item s) {
        ListNode add = new ListNode(s);
        add.next = head;
        head = add;
    }
}


class StackGeneric {
    public static <Item> void main(String[] args) {
        StackGenerics<Item> stack = new StackGenerics<Item>();
        StdOut.println("Enter '-' to pop a string and Enter string to push that string into stack separated by space.");
        StdOut.print("Enter the string: ");
        while (!StdIn.isEmpty()) {
            Item s = (Item) StdIn.readString();
            if (s.equals("-")) StdOut.print(stack.pop() + " ");
            else stack.push(s);
        }
    }
}
