package Stack;

import java.util.Stack;

public class NextGreaterElement {

    // find next greateer element
    public static void NextGreater(int arr[]) {
        int NextGreaterElement[] = new int[arr.length];
        Stack<Integer> st = new Stack<>();
        for (int i = arr.length - 1; i >= 0; i--) {
            while (!st.empty() && arr[st.peek()] <= arr[i]) {
                st.pop();
            }
            if (st.empty()) {
                NextGreaterElement[i] = -1;
            } else {
                NextGreaterElement[i] = arr[st.peek()];
            }
            st.push(i);
        }
        for (int i = 0; i < NextGreaterElement.length; i++) {
            System.err.print(NextGreaterElement[i] + " ");
        }
    }

    // find next smallest element
    public static void NextSmallest(int arr[]) {
        int NextGreaterElement[] = new int[arr.length];
        Stack<Integer> st = new Stack<>();
        for (int i = arr.length - 1; i >= 0; i--) {
            while (!st.empty() && arr[st.peek()] >= arr[i]) {
                st.pop();
            }
            if (st.empty()) {
                NextGreaterElement[i] = -1;
            } else {
                NextGreaterElement[i] = arr[st.peek()];
            }
            st.push(i);
        }
        for (int i = 0; i < NextGreaterElement.length; i++) {
            System.err.print(NextGreaterElement[i] + " ");
        }
    }

    // find next greater element in left side
    public static void NextGreaterLeft(int arr[]) {
        int NextGreaterElement[] = new int[arr.length];
        Stack<Integer> st = new Stack<>();
        for (int i = 0; i < arr.length; i++) {
            while (!st.empty() && arr[st.peek()] <= arr[i]) {
                st.pop();
            }
            if (st.empty()) {
                NextGreaterElement[i] = -1;
            } else {
                NextGreaterElement[i] = arr[st.peek()];
            }
            st.push(i);
        }
        for (int i = 0; i < NextGreaterElement.length; i++) {
            System.err.print(NextGreaterElement[i] + " ");
        }
    }

    // find next smallest element in left side
    public static void NextsmallestLeft(int arr[]) {
        int NextGreaterElement[] = new int[arr.length];
        Stack<Integer> st = new Stack<>();
        for (int i = 0; i < arr.length; i++) {
            while (!st.empty() && arr[st.peek()] >= arr[i]) {
                st.pop();
            }
            if (st.empty()) {
                NextGreaterElement[i] = -1;
            } else {
                NextGreaterElement[i] = arr[st.peek()];
            }
            st.push(i);
        }
        for (int i = 0; i < NextGreaterElement.length; i++) {
            System.err.print(NextGreaterElement[i] + " ");
        }
    }

    public static void main(String[] args) {
        int arr[] = { 4, 20, 8, 3, 11, 1 };
        // NextGreater(arr);
        // NextSmallest(arr);
        // NextGreaterLeft(arr);
        NextsmallestLeft(arr);
    }

}
