package LinkedList;

public class CircularDoublyLL {
    public class Node {
        int data;
        Node next;
        Node prev;

        public Node(int data) {
            this.data = data;
        }
    }

    public static Node head;
    public static Node tail;

    // Add element at last
    public void last(int val) {
        Node NewNode = new Node(val);
        if (head == null) {
            head = tail = NewNode;
            NewNode.next = head;
            NewNode.prev = head;
            tail = NewNode;
            return;
        }
        tail.next = NewNode;
        NewNode.prev = tail;
        NewNode.next = head;
        tail = NewNode;
    }

    // Print Linkedlist
    public static void print() {
        // Node check = tail;
        Node check = head;
        do {
            System.out.print(check.data + " <-> ");
            /* traversal from Starting */
            check = check.next;
            /* traversal from behiend */
            // check = check.prev;
        } while (check != head);
        System.out.println(head.data);
    }

    public static void main(String[] args) {
        CircularDoublyLL ll = new CircularDoublyLL();
        ll.last(1);
        ll.last(2);
        ll.last(3);
        ll.last(4);
        ll.last(5);
        ll.last(6);
        ll.last(7);

        print();

    }
}
