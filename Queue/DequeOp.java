package Queue;

import java.util.*;

public class DequeOp {
    public static void main(String[] args) {
        Deque<Integer> d = new LinkedList<>();
        // in deque we can add element front and rear also
        // and remove also
        // for example
        d.addFirst(1);
        d.addFirst(2);
        d.addFirst(3);
        System.out.println(d.peek());
        System.out.println(d);
        d.addLast(4);
        d.addLast(5);
        System.out.println(d);
        d.removeFirst();
        System.out.println(d);
        d.removeLast();
        System.out.println(d);
    }
}
