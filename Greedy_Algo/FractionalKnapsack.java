package Greedy_Algo;

import java.util.Comparator;
import java.util.*;

public class FractionalKnapsack {
    public static void main(String[] args) {
        int value[] = { 60, 100, 120 };
        int weight[] = { 10, 20, 30 };
        int weightamount = 50;
        // find maximum value in given weight
        // we declare 2D array of 2 column (First store index and second store ratio)
        double ratio[][] = new double[value.length][2];
        for (int i = 0; i < value.length; i++) {
            ratio[i][0] = i;
            ratio[i][1] = value[i] / (double) weight[i];
        }
        // assending order
        Arrays.sort(ratio, Comparator.comparingDouble(o -> o[1]));
        int totlevalue = 0;
        int capacity = weightamount;
        for (int i = ratio.length - 1; i >= 0; i--) {
            int index = (int) ratio[i][0];
            if (weight[i] <= capacity) {
                totlevalue += value[index];
                capacity -= weight[index];
            } else {
                totlevalue += ratio[i][1] * capacity;
                capacity = 0;
                break;
            }
        }
        System.out.println("totle value is = " + totlevalue);
    }
}
