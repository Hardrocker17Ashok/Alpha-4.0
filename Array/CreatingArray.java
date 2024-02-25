package Array;

import java.util.Scanner;

// import java.
public class CreatingArray {
    public static void print_array(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
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
    }
}
