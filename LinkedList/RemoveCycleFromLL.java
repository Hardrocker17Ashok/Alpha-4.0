package LinkedList;

public class RemoveCycleFromLL {
    public class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            next = null;
        }
    }

    public static Node head;
    public static Node tail;

    public void AddLast(int val) {
        Node dataval = new Node(val);
        if (head == null) {
            head = tail = dataval;
            return;
        }
        tail.next = dataval;
        tail = dataval;
    }

    public static void RemoveCycle() {

        // First check Cycle presant or not
        Node slow = head;
        Node fast = head;
        int Cycle = 0;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                Cycle = 1;
                break;
            }
        }
        if (Cycle == 0) {
            return;
        }

        // If prasent than remove Cycle
        slow = head;
        Node prev = null;
        while (slow != fast) {
            prev = fast;
            fast = fast.next;
            slow = slow.next;
        }
        prev.next = null;
    }

    // Print Linkedlist
    public static void print() {
        Node check = head;
        while (check != null) {
            System.out.print(check.data + " -> ");
            check = check.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        RemoveCycleFromLL ll = new RemoveCycleFromLL();
        ll.AddLast(3);
        ll.AddLast(4);
        ll.AddLast(5);
        ll.AddLast(6);
        ll.AddLast(7);
        ll.AddLast(8);

        // Last node point again head that's why Cycle is prasent
        tail.next = head.next.next;

        // Here this linked list alwayes running because not prasent any null pointer
        // print();
        RemoveCycle();

        // After removing Cycle we can travesal easily
        print();
    }

}
