package Stack;

import java.util.*;

public class ValidParentheses {
    public static boolean validCheck(String s) {
        Stack<Character> st = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(' || s.charAt(i) == '[' || s.charAt(i) == '{') {
                st.push(s.charAt(i));
            } else {
                if (st.empty()) {
                    return false;
                }
                if (st.peek() == '(' && s.charAt(i) == ')' || st.peek() == '[' && s.charAt(i) == ']'
                        || st.peek() == '{' && s.charAt(i) == '}') {
                    st.pop();
                } else {
                    return false;
                }
            }
        }
        if (st.empty()) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        System.err.println(validCheck("([[["));
    }
}
