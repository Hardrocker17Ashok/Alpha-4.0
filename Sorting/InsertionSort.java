package Sorting;

public class InsertionSort {
    public static void printArray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void InsertionSorting(int arr[]) {
        int num = arr.length;
        for (int i = 1; i < num; i++) {
            int key = arr[i];
            int j = i - 1;
            while (arr[j] > key && j >= 0) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
        }
    }

    public static void main(String[] args) {
        int arr[] = { 1, 4, 3, 6, 2 };
        System.out.println("Before sorting array");
        printArray(arr);
        System.out.println();
        InsertionSorting(arr);
        System.out.println("\n After sorting array");
        printArray(arr);
    }
}
