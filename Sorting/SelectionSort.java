package Sorting;

public class SelectionSort {

    public static void printArray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void SellectionSorting(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            int key = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[key] > arr[j]) {
                    key = j;
                }
            }
            int temp;
            temp = arr[i];
            arr[i] = arr[key];
            arr[key] = temp;
        }
    }

    public static void main(String[] args) {
        int arr[] = { 1, 4, 3, 6, 2 };
        System.out.println("Before sorting array");
        printArray(arr);
        System.out.println();
        SellectionSorting(arr);
        System.out.println("\n After sorting array");
        printArray(arr);
    }
}
