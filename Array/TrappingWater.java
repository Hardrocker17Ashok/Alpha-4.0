package Array;

import java.util.Scanner;

// import java.
public class TrappingWater {
    public static void print_array(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static int TreapedWater(int arr[]) {
        int TotleWaterTreaped = 0;
        int n = arr.length;
        // left max array
        int leftarray[] = new int[n];
        leftarray[0] = arr[0];
        for (int i = 1; i < n; i++) {
            leftarray[i] = Math.max(arr[i], leftarray[i - 1]);
        }
        // right max array
        int rightarray[] = new int[n];
        rightarray[n - 1] = arr[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            rightarray[i] = Math.max(arr[i], rightarray[i + 1]);
        }
        for (int i = 0; i < n; i++) {
            TotleWaterTreaped += Math.min(leftarray[i], rightarray[i]) - arr[i];
        }
        return TotleWaterTreaped;
    }

    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        System.out.println("enter size of array");
        int size = Sc.nextInt();
        int arr[] = new int[size];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Sc.nextInt();
        }
        System.out.println("print of array");
        print_array(arr);
        System.out.println();
        System.out.println("Totle water traped is = " + TreapedWater(arr));

    }
}
