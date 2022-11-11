//Corner cases.  Throw the specified exception for the following corner cases:
//
//        Throw an IllegalArgumentException if the client calls either addFirst() or addLast() with a null argument.
//        Throw a java.util.NoSuchElementException if the client calls either removeFirst() or removeLast when the deque is empty.
//        Throw a java.util.NoSuchElementException if the client calls the next() method in the iterator when there are no more items to return.
//        Throw an UnsupportedOperationException if the client calls the remove() method in the iterator.

import java.util.*;

public class Deque<Item> implements Iterable<Item> {
    private ListNode first;
    private ListNode last;

    class ListNode {
        Item val;
        ListNode prev;
        ListNode next;

        ListNode(Item val, ListNode next, ListNode prev) {
            this.next = next;
            this.prev = prev;
            this.val = val;
        }

        ListNode() {
        }
    }

    int size;

    // construct an empty deque
    public Deque() {
        size = 0;
    }

    // is the deque empty?
    public boolean isEmpty() {
        if (size == 0) return true;
        else return false;
    }

    // return the number of items on the deque
    public int size() {
        return size;
    }

    // add the item to the front
    public void addFirst(Item item) {
        //        Throw an IllegalArgumentException if the client calls either addFirst() or addLast() with a null argument.
        if (item == null) throw new IllegalArgumentException();
        ListNode n1 = new ListNode(item, first, null);
        first = n1;
        if (last == null) last = first;
        else first.next.prev = first;
        size++;
    }

    // add the item to the back
    public void addLast(Item item) {
        //        Throw an IllegalArgumentException if the client calls either addFirst() or addLast() with a null argument.
        if (item == null) throw new IllegalArgumentException();
        ListNode n2 = new ListNode(item, null, last);
        last = n2;
        if (first == null) first = last;
        else last.prev.next = last;
        size++;
    }

    // remove and return the item from the front
    public Item removeFirst() throws NoSuchElementException {
        //        Throw a java.util.NoSuchElementException if the client calls either removeFirst() or removeLast when the deque is empty.

        if (isEmpty()) {
            first = null;
            last = null;
//            throw new NoSuchElementException();
        }
        Item val = first.val;
        first = first.next;
        first.prev = null;
        size--;
        return val;
    }

    // remove and return the item from the back
    public Item removeLast() {
        //        Throw a java.util.NoSuchElementException if the client calls either removeFirst() or removeLast when the deque is empty.
        if (isEmpty()) {
            first = null;
            last = null;
            throw new NoSuchElementException();
        }
        Item val = last.val;
        last = last.prev;
        last.next = null;
        size--;
        return val;
    }

    // return an iterator over items in order from front to back
    @Override
    public Iterator<Item> iterator() {
        //        Throw a java.util.NoSuchElementException if the client calls the next() method in the iterator when there are no more items to return.
        //        Throw an UnsupportedOperationException if the client calls the remove() method in the iterator.
        return new ListIterator();
    }

    public class ListIterator implements Iterator<Item> {
        private ListNode curr = first;

        @Override
        public boolean hasNext() {
            return curr != null;
        }

        @Override
        public Item next() {
            if (!hasNext()) throw new NoSuchElementException();
            Item val = curr.val;
            curr = curr.next;
            return val;

        }

        @Override
        public void remove() {
            throw new UnsupportedOperationException();
        }
    }

    public void print() {
        ListNode temp = first;
        while (temp != null) {

            System.out.print(temp.val + " ");
            temp = temp.next;
        }
    }

    // unit testing (required)
    public static void main(String[] args) {
        Deque<Integer> DQ = new Deque<Integer>();
        DQ.addFirst(1);
        DQ.addFirst(10);
        DQ.addFirst(112121);
        DQ.addLast(1);
//        DQ.removeFirst();
        DQ.print();
        System.out.println();
        System.out.println("size: " + DQ.size());
//        DQ.removeLast();
//        System.out.println(DQ.isEmpty());
    }

}
