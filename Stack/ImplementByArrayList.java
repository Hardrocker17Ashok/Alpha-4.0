package Stack;

import java.util.*;

public class ImplementByArrayList {

    static ArrayList<Integer> stack = new ArrayList<>();

    // check stack is empty or not
    public static boolean isempty() {
        if (stack.size() == 0) {
            return true;
        }
        return false;
    }

    // Push operation
    public void push(int data) {
        stack.add(data);
    }

    // Pop operation
    public int pop() {
        int top = stack.get(stack.size() - 1);
        stack.remove(stack.size() - 1);
        return top;
    }

    // Peek operation
    public int peek() {
        int top = stack.get(stack.size() - 1);
        return top;
    }

    public static void main(String[] args) {
        ImplementByArrayList al = new ImplementByArrayList();
        al.push(1);
        al.push(2);
        al.push(3);
        al.push(4);
        while (!isempty()) {
            System.out.println(al.peek());
            al.pop();
        }
    }
}
