package Array;

import java.util.Scanner;

public class Reverse {
    public static void print_array(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void reverse_array(int arr[]) {
        int first = 0;
        int last = arr.length - 1;
        while (first < last) {
            int temp;
            temp = arr[first];
            arr[first] = arr[last];
            arr[last] = temp;
            first++;
            last--;
        }
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
        System.out.println("Before reversing an array");
        reverse_array(arr);
        System.out.println("After reversing an array");
        print_array(arr);
    }
}
