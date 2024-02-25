package Queue;

import java.util.Queue;

public class ImpUsingLL {
    static class node {
        int data;
        node next;

        node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    static class Queue {
        static node head = null;
        static node tail = null;

        // add data in queue help of linked list
        public static void add(int data) {
            node newnode = new node(data);
            if (head == null) {
                head = tail = newnode;
            }
            tail.next = newnode;
            tail = newnode;
        }

        // remove data in queue help of linked list
        public static int remove() {
            if (head == null) {
                System.out.println("This queue is empty");
                return -1;
            }
            int value = head.data;
            if (head == tail) { // when only one node in linked list
                head = tail = null;
            } else {
                head = head.next;
            }
            return value;
        }

        // peek data from queue help of linked list
        public static int peek() {
            if (head == null) {
                System.out.println("This queue is empty");
                return -1;
            }
            int value = head.data;
            return value;
        }

    }

    public static void main(String[] args) {

        Queue ob = new Queue();
        ob.add(1);
        ob.add(2);
        ob.add(3);
        ob.add(4);
        ob.add(5);
        ob.add(6);
        System.out.println(ob.remove());
        System.out.println(ob.remove());
        System.out.println(ob.peek());
    }

}
