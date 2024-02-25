package LinkedList;

public class SinglyLL {
    public class node {
        int data;
        node next;

        public node(int data) {
            this.data = data;
            next = null;
        }
    }

    public static node head;
    public static node tail;

    // Add first
    public void AddFirst(int data) {
        node newnode = new node(data);
        if (head == null) {
            head = tail = newnode;
            return;
        }
        newnode.next = head;
        head = newnode;
    }

    // Add at the and
    public void AddLast(int data) {
        node newnode = new node(data);
        if (head == null) {
            head = tail = newnode;
            return;
        }
        tail.next = newnode;
        tail = newnode;
    }

    public void print() {
        node check = head;
        while (check != null) {
            System.out.print(check.data + " -> ");
            check = check.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        SinglyLL ll = new SinglyLL();
        ll.AddLast(13);
        ll.AddLast(14);
        ll.AddLast(15);
        ll.AddLast(16);
        ll.print();
        ll.AddFirst(100);
        ll.AddFirst(200);
        ll.print();
    }
}
