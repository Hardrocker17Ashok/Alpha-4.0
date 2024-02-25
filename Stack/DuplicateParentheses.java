package Stack;

import java.util.*;

public class DuplicateParentheses {
    public static boolean Check(String s) {
        Stack<Character> st = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char ch=s.charAt(i);
            if (ch == ')') {
                int count=0;
                while (st.peek()!='(') {
                    st.pop();
                    count++;
                }
                if(count<1){
                    return true; //it means duplicate prasent
                }
                else{
                    st.pop(); //for opening pair
                }
            }
        else {
            st.push(ch);
        }
    }
    return false;
}

    public static void main(String[] args) {
        // if duplicate prasent tha print true otherwise print false
        System.err.println(Check("(((a+b)*(a*b)))"));
    }
}
