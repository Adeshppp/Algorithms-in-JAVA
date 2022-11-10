import java.util.*;

public class StackFIFO {
    private static Stack<Integer> s1 = new Stack<Integer>();
    private static Stack<Integer> s2 = new Stack<Integer>();

    public static void main(String[] args) {
        enqueue(15);
        enqueue(100);
        enqueue(1054);
        enqueue(1043);
        enqueue(102);
        enqueue(1340);
        dequeue();
        dequeue();
        dequeue();
        dequeue();
        enqueue(30);
        enqueue(40);
        enqueue(60);
        enqueue(40);


        dequeue();
    }

    public static void enqueue(int n) {
        s1.push(n);
    }

    public static void dequeue() {
        if (s2.isEmpty()) while (!s1.isEmpty()) s2.push(s1.pop());

        System.out.println(s2.pop());
    }
}
