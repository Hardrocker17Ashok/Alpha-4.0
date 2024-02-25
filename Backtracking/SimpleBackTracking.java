package Backtracking;

public class SimpleBackTracking {
    public static void backtrack(int arr[], int index, int val) {
        if (index == arr.length) {
            printarray(arr);
            return;
        }
        arr[index] = val;
        backtrack(arr, index+1, val+1);
        arr[index] = arr[index] - 2;
    }

    public static void printarray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        int arr[] = new int[10];
        backtrack(arr, 0, 1);
        System.out.println(" \nAfter backtracking changes");
        printarray(arr);
    }
}
