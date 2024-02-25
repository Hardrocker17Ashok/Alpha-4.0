package LinkedList;

public class CircularLL {
    public class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
        }
    }

    public static Node head;
    public static Node tail;

    // Add element at last in Circular Linked List
    public void last(int val) {
        Node NewNode = new Node(val);
        if (head == null) {
            head = tail = NewNode;
            tail.next = head;
            return;
        }
        tail.next = NewNode;
        NewNode.next = head;
        tail = NewNode;
    }

    // Add element at first in Circular LinkedList
    public void first(int val) {
        Node NewNode = new Node(val);
        if (head == null) {
            head = tail = NewNode;
            tail.next = head;
            return;
        }
        NewNode.next = head;
        tail.next = NewNode;
        head = NewNode;
    }

    // // removing element ->>>>>>>>>>

    // // Remove element at last
    public void Rlast() {
        if (head == null) {
            System.out.println("Linked list Already Empty");
            return;
        }
        Node check = head;
        do {
            check = check.next;
        } while (check.next.next != head);
        check.next = head;
        tail = check;
    }

    // // Remove element at first
    public void Rfirst() {
        if (head == null) {
            System.out.println("The linkedlist Already Empty");
            return;
        }
        tail.next = head.next;
        head = head.next;
    }

    // Print Linkedlist
    public static void print() {
        Node check = head;
        do {
            System.out.print(check.data + " -> ");
            check = check.next;
        } while (check != head);
        System.out.println(head.data);
    }

    public static void main(String[] args) {
        CircularLL ll = new CircularLL();
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

        // ll.Rfirst();
        // ll.Rfirst();
        // print();
    }
}
