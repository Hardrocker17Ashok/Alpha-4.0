package LinkedList;

public class DoublyLL {
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

    // Add element at first
    public void first(int val) {
        Node NewNode = new Node(val);
        if (head == null) {
            size++;
            head = tail = NewNode;
            return;
        }
        size++;
        NewNode.next = head;
        head.prev = NewNode;
        head = NewNode;
    }

    // removing element
    // Remove element at last
    public void Rlast() {
        if (head == null) {
            System.out.println("Linked list Already Empty");
            return;
        }
        size--;
        tail.prev.next = null;
        tail = tail.prev;
    }

    // Remove element at first
    public void Rfirst() {
        if (head == null) {
            System.out.println("The linkedlist Already Empty");
            return;
        }
        size--;
        head.next.prev = null;
        head = head.next;
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
        DoublyLL ll = new DoublyLL();
        ll.last(1);
        ll.last(2);
        ll.last(3);
        ll.last(4);
        ll.last(5);
        ll.last(6);
        ll.last(7);

        ll.first(100);
        ll.first(200);
        ll.first(300);

        print();

        ll.Rlast();
        ll.Rlast();

        print();

        ll.Rfirst();
        ll.Rfirst();
        print();
    }
}
