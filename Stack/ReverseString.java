// package Stack;

import java.util.*;

// import Stack.ImplementByLinkedList.stack;
public class ReverseString {
    public static String Rev(String s) {
        Stack<Character> st = new Stack<>();
        int ind = 0;
        while (ind < s.length()) {
            char val = s.charAt(ind);
            st.push(val);
            ind++;
        }
        StringBuffer result = new StringBuffer("");
        while (!st.empty()) {
            char top = st.peek();
            result.append(top);
            st.pop();
        }
        // Change Stringbuilder to String
        s = result.toString();
        return s;
    }

    public static void main(String[] args) {
        String s = "Ashok sharma";
        System.err.println("Before reverse \n" + s);
        System.err.println("After reverse \n" + Rev(s));
    }
}
