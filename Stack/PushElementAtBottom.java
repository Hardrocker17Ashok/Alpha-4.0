package Stack;

import java.util.*;

public class PushElementAtBottom {
    public static void AddAtBottom(Stack<Integer> st, int data) {
        if (st.isEmpty()) {
            st.push(data);
            return;
        }
        int top = st.pop();
        AddAtBottom(st, data);
        st.push(top);
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
        // here stack will be -> 3,2,1
        AddAtBottom(st, 4);
        // and after add at bottom stack will be -> 3,2,1,4
        printStack(st);
    }
}
