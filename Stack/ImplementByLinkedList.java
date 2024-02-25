package Stack;

public class ImplementByLinkedList {
    public static class node {
        int data;
        node next;

        public node(int data) {
            this.data = data;
            next = null;
        }

    }

    static class stack {
        static node head = null;
        // check stack is empty or not
        public static boolean isempty() {
            if (head == null) {
                return true;
            }
            return false;
        }

        // push
        public static void push(int data) {
            node NewNode = new node(data);
            if (isempty()) {
                head = NewNode;
                return;
            }
            NewNode.next = head;
            head = NewNode;
        }

        // Pop
        public static void pop() {
            // int top = head.data;
            head = head.next;
            // return top;
        }

        // Peek operation
        public static int peek() {
            return head.data;
        }
    }

    public static void main(String[] args) {
        stack al = new stack();
        al.push(1);
        al.push(2);
        al.push(3);
        al.push(4);
        while (!al.isempty()) {
            System.out.println(al.peek());
            al.pop();
        }
    }
}
