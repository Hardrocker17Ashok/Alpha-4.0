// package LinkedList;

public class RemoveNthElementFromEnd {
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

    public void AddLast(int data) {
        node newnode = new node(data);
        if (head == null) {
            head = tail = newnode;
            return;
        }
        tail.next = newnode;
        tail = newnode;
    }

    // Remove Nth element from end of linkedlist
    public static void RemoveFromEnd(int value) {
        node check = head;
        int size = 0;
        while (check != null) {
            check = check.next;
            size++;
        }
        if (value == size) {
            head = head.next;
            return;
        }
        int realnumber = size - value;
        int i = 1;
        node run = head;
        while (i < realnumber) {
            run = run.next;
            i++;
        }
        run.next = run.next.next;
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
        RemoveNthElementFromEnd ll = new RemoveNthElementFromEnd();
        ll.AddLast(13);
        ll.AddLast(14);
        ll.AddLast(15);
        ll.AddLast(16);
        ll.AddLast(17);
        ll.AddLast(18);
        ll.AddLast(19);
        ll.AddLast(20);
        System.out.println("This is linked list Befor removing element");
        ll.print();
        RemoveFromEnd(3);
        int val = sizeofll();
        System.out.println(val);
        System.out.println("This is linked list After removing element");
        ll.print();
    }
}
