package LinkedList;

public class ReverseDoublyLL {
    public class Node {
        int data;
        Node next;
        Node prev;

        public Node(int data) {
            this.data = data;
            next = null;
            prev = null;
        }
    }

    public static Node head;
    public static Node tail;
    public static int size;

    // Add element at last
    public void last(int val) {
        Node NewNode = new Node(val);
        if (head == null) {
            size++;
            head = tail = NewNode;
            return;
        }
        size++;
        tail.next = NewNode;
        NewNode.prev = tail;
        tail = NewNode;
    }

    public static void ReverseLL() {
        if (head == null || head.next == null) {
            System.out.println("It's already reverseable");
            return;
        }
        Node curr = tail = head;
        Node past = null;
        Node next;
        while (curr != null) {
            next = curr.next;
            curr.next = past;
            curr.prev = next;

            past = curr;
            curr = next;
        }
        head = past;
    }

    // Print Linkedlist
    public static void print() {
        // Node check = tail;
        Node check = head;
        while (check != null) {
            System.out.print(check.data + " <-> ");
            /* traversal from behiend */
            // check = check.prev;

            /* traversal from startind */
            check = check.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        ReverseDoublyLL ll = new ReverseDoublyLL();
        ll.last(1);
        ll.last(2);
        ll.last(3);
        ll.last(4);
        ll.last(5);
        ll.last(6);
        ll.last(7);
        System.out.println("Before Reverse");
        print();
        ReverseLL();
        System.out.println("After Reverse");
        print();
    }
}
