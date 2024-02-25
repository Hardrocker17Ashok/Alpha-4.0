package LinkedList;

public class CheckLLisPalindrome {
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

    // Find mid element whit slow fast approch
    public static node findmid() {
        node slow = head;
        node fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    public static boolean checkpalindrome() {
        if (head == null || head.next == null) {
            return true;
        }
        // step 1 find mid element of linkedlist
        node midlement = findmid();

        // step 2 reverse 2nd part of linked list
        node pre = null;
        node curr = midlement;
        node next;
        while (curr != null) {
            next = curr.next;
            curr.next = pre;
            pre = curr;
            curr = next;
        }

        // step 3 compair first part and second part of linkedlist
        node right = pre;
        node left = head;
        while (right != null) {
            if (left.data != right.data) {
                return false;
            }
            left = left.next;
            right = right.next;
        }
        return true;
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
        CheckLLisPalindrome ll = new CheckLLisPalindrome();
        ll.AddLast(13);
        ll.AddLast(14);
        ll.AddLast(14);
        ll.AddLast(14);
        System.out.println("This is linked list");
        ll.print();
        System.out.println(checkpalindrome());
    }
}
