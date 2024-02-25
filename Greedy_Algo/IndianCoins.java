package Greedy_Algo;

import java.util.*;

public class IndianCoins {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 5, 10, 20, 50, 100, 500, 2000 };
        // find minimum number of coin to change given actual value of v
        Arrays.sort(arr);
        int amount = 500;
        int maxcount = 0;
        for (int i = arr.length - 1; i >= 0; i--) {
            if (arr[i] <= amount) {
                while (arr[i] <= amount) {
                    maxcount++;
                    amount -= arr[i];
                }
            }
        }
        System.out.println(maxcount);
    }
}
