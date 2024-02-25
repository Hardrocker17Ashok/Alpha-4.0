package Array;

import java.util.Scanner;

public class MaximumSubArray {
    public static void print_array(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    // if all value is negitive than this kadanes algo not working properlly
    // than we use another method for negitive condition
    public static int MaxiSubArray(int arr[]) {
        int cs = Integer.MIN_VALUE;
        int maxvalue = -1;
        for (int i = 0; i < arr.length; i++) {
            cs += arr[i];
            if (cs < 1) {
                cs = 0;
            }
            maxvalue = Math.max(cs, maxvalue);
        }
        return maxvalue;
    }

    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        System.out.println("enter size of array");
        int size = Sc.nextInt();
        int arr[] = new int[size];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Sc.nextInt();
        }
        print_array(arr);
        System.out.println("totle of bigger sub array is = " + MaxiSubArray(arr));
    }
}
