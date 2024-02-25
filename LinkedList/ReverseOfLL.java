package LinkedList;

public class ReverseOfLL {
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

    // public void AddFirst(int data) {
    //     node newnode = new node(data);
    //     if (head == null) {
    //         head = tail = newnode;
    //         return;
    //     }
    //     newnode.next = head;
    //     head = newnode;
    // }

    public void AddElement(int data) {
    node newnode = new node(data);
    if (head == null) {
    head = tail = newnode;
    return;
    }
    tail.next = newnode;
    tail = newnode;
    }
    public void reverseLL() {
        node preve = null;
        node curr = tail = head;
        node next;
        while (curr != null) {
            next = curr.next;
            curr.next = preve;
            preve = curr;
            curr = next;
        }
        head = preve;
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
        ReverseOfLL ll = new ReverseOfLL();
        ll.AddElement(11);
        ll.AddElement(12);
        ll.AddElement(101);
        ll.AddElement(102);
        ll.AddElement(103);
        ll.AddElement(104);
        ll.AddElement(105);
        ll.AddElement(106);
        System.out.println("The linked list before reverse");
        ll.print();
        ll.reverseLL();
        System.out.println("The linked list After reverse");
        ll.print();
    }
}
