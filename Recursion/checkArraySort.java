package Recursion;

public class checkArraySort {
    public static boolean Check(int arr[], int index) {
        if (index == arr.length - 1) {
            return true;
        }
        if (arr[index] > arr[index + 1]) {
            return false;
        }
        return Check(arr, index + 1);
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 4, 6, 70, 9 };
        System.out.println(Check(arr, 0));
    }
}
