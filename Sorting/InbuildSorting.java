package Sorting;

import java.util.Scanner;
// import java.util.Collections;
import java.util.*;

public class InbuildSorting {

    static void print_array(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    static void InbuildSort(int arr[]) {
        Arrays.sort(arr);
    }

    static void InbuildSortWithIndex(int arr[], int a, int b) {
        Arrays.sort(arr,a,b);
    }

    // static void InbuildReverseSort(int arr[]) {
    //     Arrays.sort(arr, Collections.reverseOrder());
    // }

    // static void InbuildReverseSortWithIndex(int arr[], int a, int b) {
    //     Arrays.sort(arr);
    // }

    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        System.out.println("enter size of array");
        int size = Sc.nextInt();
        int arr[] = new int[size];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Sc.nextInt();
        }
        print_array(arr);
        System.out.println("\n array in sorting form");

        // Sort all element of this array
        // InbuildSort(arr);
        System.out.println();
        print_array(arr);
        System.out.println();
        
        // Sort array element of given indexes
        InbuildSortWithIndex(arr,2,6);
        System.out.println();
        print_array(arr);
        // InbuildReverseSort(arr);
        // InbuildReverseSortWithIndex(arr,1,3);
    }
}
