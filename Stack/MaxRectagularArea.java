package Stack;

import java.util.*;

public class MaxRectagularArea {
    public static int MaxArea(int arr[]) {

        int sr[] = new int[arr.length];
        int sl[] = new int[arr.length];
        // find lowest element in right side
        Stack<Integer> st = new Stack<>();
        for (int i = arr.length - 1; i >= 0; i--) {
            while (!st.isEmpty() && arr[st.peek()] >= arr[i]) {
                st.pop();
            }
            if (st.empty()) {
                sr[i] = arr.length;
            } else {
                sr[i] = st.peek();
            }
            st.push(i);
        }
        // find lowest element in left side
        st = new Stack<>();
        for (int i = 0; i < arr.length; i++) {
            while (!st.isEmpty() && arr[st.peek()] >= arr[i]) {
                st.pop();
            }
            if (st.empty()) {
                sl[i] = -1;
            } else {
                sl[i] = st.peek();
            }
            st.push(i);

        }
        System.out.println("right smaller");
        for (int i = 0; i < sr.length; i++) {
            System.out.print(sr[i]);
        }
        System.err.println("\nleft smaller");
        System.out.println();
        for (int i = 0; i < sl.length; i++) {
            System.out.print(sl[i]);
        }
        // find max area
        int maxArea = 0;
        for (int i = 0; i < arr.length; i++) {
            int height = arr[i];
            int width = sr[i] - sl[i] - 1;
            int totleArea = width * height;
            maxArea = Math.max(totleArea, maxArea);
        }
        return maxArea;

    }

    public static void main(String[] args) {
        int arr[] = { 1, 10, 1, 4, 2, 8, 2 };
        int result = MaxArea(arr);
        System.out.println("Max area is = " + result);
    }
}
