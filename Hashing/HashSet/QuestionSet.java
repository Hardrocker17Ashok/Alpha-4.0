package Hashing.HashSet;

import java.util.*;

public class QuestionSet {
    // Q1. Union element from two array
    public static void Union(int arr1[], int arr2[]) {
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < arr1.length; i++) {
            set.add(arr1[i]);
        }
        for (int i = 0; i < arr2.length; i++) {
            set.add(arr2[i]);
        }
        for (int val : set) {
            System.err.print(val + " ");
        }
    }

    // Q2. Intersection element from two array
    public static void Intersection(int arr1[], int arr2[]) {
        HashSet<Integer> set = new HashSet<>();
        HashSet<Integer> inter = new HashSet<>();
        for (int i = 0; i < arr1.length; i++) {
            set.add(arr1[i]);
        }
        for (int i = 0; i < arr2.length; i++) {
            if (set.contains(arr2[i])) {
                inter.add(arr2[i]);
                set.remove(arr2[i]);
            }
        }
        for (int val : inter) {
            System.err.print(val + " ");
        }
    }

    public static void main(String[] args) {
        int arr1[] = { 2, 4, 6, 8, 1 };
        int arr2[] = { 1, 4, 60, 8,1, 0 };
        // Union(arr1, arr2);
        Intersection(arr1, arr2);
    }
}
