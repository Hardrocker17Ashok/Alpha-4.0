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
        // And add each element at bottom of stack help of AddAtBottom function
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
        st.push(5);frv44r4fvfr4fv
        RevStack(st);
        printStack(st);
    }]fv]frv4frv4]frv44r4fvfr4fv]r4] f4rv4]4rvf4]vr]]]]fr4fr4frv4frv]4]rv4v]fr]fvfr4]fr4frv4]frv4]fv]r4]4]4]fv]r4f4]

}
