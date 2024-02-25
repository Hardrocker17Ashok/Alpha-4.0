package Greedy_Algo;

import java.util.*;

public class MinabsDiffPairs {
    public static void main(String[] args) {
        int arr1[] = { 60, 10, 100, 140 };
        int arr2[] = { 100, 200, 300, 80 };
        // find minimum absolute difference pair
        // sort both array for find minimum abs value pair
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        int minimumabs = 0;
        for (int i = 0; i < arr1.length; i++) {
            minimumabs += Math.abs(arr1[i] - arr2[i]);
        }
        System.out.println("totle minimum absolute difference value is = " + minimumabs);
    }
}
