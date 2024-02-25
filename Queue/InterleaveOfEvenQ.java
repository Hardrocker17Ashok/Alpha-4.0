package Queue;

import java.util.*;

public class InterleaveOfEvenQ {
    public static void Inter(Queue<Integer> q) {
        Queue<Integer> half = new LinkedList<>();
        int size = q.size();
        for (int i = 0; i < size / 2; i++) { // direct we can't inisilize size in loop because every itration queue size
                                             // is
                                             // changeble
            half.add(q.remove());
        }
        while (!half.isEmpty()) {
            q.add(half.remove());
            q.add(q.remove());
        }
    }

    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        q.add(6);
        q.add(7);
        q.add(8);
        q.add(9);
        q.add(10);
        System.out.println(q);
        Inter(q);
        System.out.println(q);
    }
}
