// package Stack;

import java.util.Stack;

public class CollectionFramework {
    public static void main(String[] args) {
        Stack<Integer> st=new Stack<>();
        // push operation
        for(int i=1;i<=10;i++){
            st.push(i);
        }
        // Empty
        while(!st.empty()){
            // to take top element of stack
            System.out.println(st.peek());
            // remove element from this stack
            st.pop();
        }
    }
}
