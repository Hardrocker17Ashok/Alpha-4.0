package Stack;

import java.util.Stack;

public class ReverseStack {
    public static void AddAtBottom(Stack<Integer> st, int data) {
        if (st.isEmpty()) {
            st.push(data);
            return;
        }
        int top = st.pop();
        AddAtBottom(st, data);
        st.push(top);
    }

    public static void RevStack(Stack<Integer> st) {
        if (st.isEmpty()) {
        // if empty than return
            return;
        }
        // peek top element of stack
        int top = st.pop();
        // call untill stack is empty
        RevStack(st);
        // and add each element at bottom of stack help of AddAtBottom function
        AddAtBottom(st, top);
    }

    public static void printStack(Stack<Integer> st) {
        while (!st.isEmpty()) {
            System.out.println(st.pop());
        }
    }

    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);
        RevStack(st);
        printStack(st);
    }

}
