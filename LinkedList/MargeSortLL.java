// package LinkedList;
import org.w3c.dom.Node;

public class MargeSortLL {
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

    public node merge(node left,node right){

    }

    // Find mid element whit slow fast approch
    public static node findmid() {
        node slow = head;
        node fast = head.next;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    } 

    public Node MergeSort(node head) {
        if (head == null || head.next == null) {
            return head;
        }
        // step 1 find mid element of linkedlist
        node midlement = findmid();
        node right=midlement.next;
        midlement.next=null;

        node leftPoin=MergeSort(head);
        node rightPoin=MergeSort(right);
        return merge(leftPoin, rightPoin);
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
        MargeSortLL ll = new MargeSortLL();
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