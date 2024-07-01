
// package DP;
import java.util.*;;

public class ClimbingStair {
    // recursion
    public static int countWaysByRecursion(int n) {
        if (n == 0) {
            return 1;
        }
        if (n < 0) {
            return 0;
        }
        return countWaysByRecursion(n - 1) + countWaysByRecursion(n - 2);
    }

    // memoizatioon
    public static int countWaysByMemoization(int n, int arr[]) {
        if (n == 0) {
            return 1;
        }
        if (n < 0) {
            return 0;
        }
        if (arr[n] != -1) {
            return arr[n];
        }
        return countWaysByMemoization(n - 1, arr) + countWaysByMemoization(n - 2, arr);
    }

    // teebulation
    public static int countWaysByTebulation(int n) {
        int arr1[] = new int[n + 1];
        arr1[0] = 1;
        for (int i = 1; i <= n; i++) {
            if (i == 1) {
                arr1[i] = arr1[i - 1] + 0;
            } else {
                arr1[i] = arr1[i - 1] + arr1[i - 2];
            }
        }
        return arr1[n];
    }

    public static void main(String[] args) {
        int n = 5;
        int arr[] = new int[n + 1];
        Arrays.fill(arr, -1);
        // System.out.println(countWaysByRecursion(n));
        // System.out.println(countWaysByMemoization(n, arr));
        System.out.println(countWaysByTebulation(n));
    }
}
