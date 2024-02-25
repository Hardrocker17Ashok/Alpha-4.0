package Sorting;

public class CountingSort {
    public static void printArray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void CountingSorting(int arr[]) {
        int num = arr.length;
        int maxvalue = Integer.MIN_VALUE;
        for (int i = 0; i < num; i++) {
            maxvalue = Math.max(maxvalue, arr[i]);
        }
        int countarray[] = new int[maxvalue + 1];
        for (int i = 0; i < num; i++) {
            countarray[arr[i]]++;
        }
        int j = 0;
        for (int i = 0; i < countarray.length; i++) {
            while (countarray[i] > 0) {
                arr[j] = i;
                j++;
                countarray[i]--;
            }
        }
    }

    public static void main(String[] args) {
        int arr[] = { 1, 4, 3, 6, 2, 11, 23, 1, 2, 4, 5, 3 };
        System.out.println("Before sorting array");
        printArray(arr);
        System.out.println();
        CountingSorting(arr);
        System.out.println("\n After sorting array");
        printArray(arr);
    }
}
