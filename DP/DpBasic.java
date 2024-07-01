// package DP;
public class DpBasic {
    // time complexity is (2^n)
    public static int byRecursion(int n) {
        if (n == 1 || n == 0) {
            return n;
        }
        return byRecursion(n - 1) + byRecursion(n - 2);
    }

    // we can apply DP by two way first memoization and second tebulation for reduce
    // time complexity by linear...
    public static int bymemoization(int n, int arr[]) {
        if (n == 1 || n == 0) {
            return n;
        }
        if (arr[n] != 0) {
            return arr[n];
        }
        return bymemoization(n - 1, arr) + bymemoization(n - 2, arr);
    }

    // we can do this problam by another DP way like tebulation
    public static int byTebulation(int n) {
        int arr[] = new int[n + 1];
        arr[0] = 0;
        arr[1] = 1;
        for (int i = 2; i <= n; i++) {
            arr[i] = arr[i - 1] + arr[i - 2];
        }
        return arr[n];
    }

    public static void main(String[] args) {
        int n = 4;
        // System.out.print(byRecursion(n));
        int arr[] = new int[n + 1]; // by defalt value will be 0 for all array element
        System.out.print(bymemoization(n, arr));
        // System.out.print(byTebulation(n));
    }
}
