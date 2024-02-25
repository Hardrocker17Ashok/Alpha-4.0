package Recursion;

public class CheckFirstOccurence {
    public static int CheckIndex(int arr[], int key, int ind) {
        if (ind == arr.length - 1) {
            return -1;
        }
        if (arr[ind] == key) {
            return ind;
        }
        return CheckIndex(arr, key, ind + 1);
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 4, 5,6, 70, 9 };
        System.out.println(CheckIndex(arr, 6, 0));
    }
}
