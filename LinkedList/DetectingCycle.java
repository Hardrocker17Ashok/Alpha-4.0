package LinkedList;

public class DetectingCycle {
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

    public boolean isCycle() {
        Node slow = head;
        Node fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        DetectingCycle ll = new DetectingCycle();
        ll.AddLast(3);
        ll.AddLast(4);
        ll.AddLast(5);
        ll.AddLast(6);
        ll.AddLast(7);
        ll.AddLast(8);

        // Last node point again head that's why Cycle is prasent
        tail.next = head.next;

        if (ll.isCycle()) {
            System.out.println("Cycle is prasent");
        } else {
            System.out.println("Cycle is not prasent");
        }
    }

    public void RemoveCycleFromLL() {
    }

}
