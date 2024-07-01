package Hashing.HashMap;

import java.util.*;

public class Question {

    // QQ 1.
    public static void majorityElement(int arr[]) {
        int size = arr.length;
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < size; i++) {
            if (map.containsKey(arr[i])) {
                map.put(arr[i], map.get(arr[i]) + 1);
            } else {
                map.put(arr[i], 1);
            }
        }
        for (int key : map.keySet()) {
            // majority means check if frequency of element in array is greater than size of
            // array/3
            if (map.get(key) > (size / 3)) {
                System.out.println(key);
            }
        }
    }

    // QQ 2. Find starting destination
    public static String findStaringPoint(HashMap<String, String> map) {
        HashMap<String, String> check = new HashMap<>();
        for (String key : map.keySet()) {
            check.put(map.get(key), key);
        }
        for (String key : map.keySet()) {
            if (!check.containsKey(key)) {
                return key;
            }
        }
        return " ";
    }

    // QQ 3. Subarray Sum equal to K
    // Prefix[i]-Prefix[i-1];

    public static int countSubArray(int arr[], int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, 1);
        int sum = 0;
        int ans = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];

            if (map.containsKey(sum - k)) {
                ans += map.get(sum - k);
            }
            if (map.containsKey(sum)) {
                map.put(sum, map.get(sum) + 1);
            } else {
                map.put(sum, 1);
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        // int arr[] = { 1, 2, 4, 5, 6, 7, 2, 4, 5, 6, 1, 1, 1, 8, 34, 23, 1, 2, 2, 6,
        // 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 };
        // majorityElement(arr);
        // HashMap<String, String> map = new HashMap<>();
        // map.put("jaipur", "raj");
        // map.put("delhi", "bikaner");
        // map.put("bikaner", "jaipur");
        // map.put("banglore", "delhi");
        // map.put("raj", "dubai");
        // String start = findStaringPoint(map);
        // System.out.println(start); // starting point
        // while (map.containsKey(start)) {
        // System.out.print(start + "->");
        // start = map.get(start);
        // }
        int arr[] = {10,2,-2,-20,10};
        int total = countSubArray(arr, -10);
        System.out.println(total);
    }
}
