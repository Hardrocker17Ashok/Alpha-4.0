package Queue;

import java.util.*;

public class FirstNonRepeatingletter {
    public static void check(String s) {
        Queue<Character> q = new LinkedList<>();
        int arr[] = new int[26];
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            q.add(ch);
            arr[ch - 'a']++;
            while (!q.isEmpty() && arr[q.peek() - 'a'] > 1) {
                q.remove();
            }
            if (q.isEmpty()) {
                System.out.print("-1" + " ");
            } else {
                System.out.print(q.peek() + " ");
            }
        }
    }

    public static void main(String[] args) {
        String ss = "aabccxb";
        check(ss);
    }
}
