package Stack;

import java.util.*;

public class StackUsingTwoQ {

    static class Stack_Using_Two_Q {
        static Queue<Integer> q1 = new LinkedList<>();
        static Queue<Integer> q2 = new LinkedList<>();

        public static boolean isempty() {
            return q1.isEmpty() && q2.isEmpty();
        }

        // add element in stack help of two queue
        public static void add(int data) {
            if (!q1.isEmpty()) {
                q1.add(data);
            } else {
                q2.add(data);
            }
        }

        // remove
        public static int remove() {
            if (isempty()) {
                System.out.println("stack is empty");
                return -1;
            }
            int top = -1;
            if (!q1.isEmpty()) {
                while (!q1.isEmpty()) {
                    top = q1.remove();
                    if (q1.isEmpty()) {
                        break;
                    }
                    q2.add(top);
                }
            } else {
                while (!q2.isEmpty()) {
                    top = q2.remove();
                    if (q2.isEmpty()) {
                        break;
                    }
                    q1.add(top);
                }
            }

            return top;
        }

        // peek
        public static int peek() {
            if (isempty()) {
                System.out.println("stack is empty");
                return -1;
            }
            int top = -1;
            if (!q1.isEmpty()) {
                while (!q1.isEmpty()) {
                    top = q1.remove();
                    q2.add(top);
                }
            } else {
                while (!q2.isEmpty()) {
                    top = q2.remove();
                    q1.add(top);
                }
            }

            return top;
        }
    }

    public static void main(String[] args) {
        Stack_Using_Two_Q ob = new Stack_Using_Two_Q();
        ob.add(1);
        ob.add(11);
        ob.add(12);
        ob.add(13);
        System.out.println(ob.peek());
        System.out.println(ob.remove());
        System.out.println(ob.remove());
        System.out.println(ob.peek());
    }
}
