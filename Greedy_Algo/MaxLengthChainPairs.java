package Greedy_Algo;

import java.util.*;
import java.util.ArrayList;
import java.util.Comparator;

public class MaxLengthChainPairs {
    public static void main(String[] args) {
        // we will find maximum chain pair
        // chain pair means->suppose pair1 is (a,b) and pair2 is (c,d) than should be c
        // > d
        // we declare 2D Array for ith row and 3 column
        // first column store index of array second column store first value value and
        // third
        // column store second value

        // it's very similler to activity selection
        int start[] = { 5, 39, 5, 27, 50 };
        int end[] = { 24, 60, 28, 40, 90 };
        int chain[][] = new int[start.length][3];
        ArrayList<Integer> val2 = new ArrayList<>();

        for (int i = 0; i < start.length; i++) {
            chain[i][0] = i;
            chain[i][1] = start[i];
            chain[i][2] = end[i];
        }

        // now we will sort this 2D array
        // it is call lambda function->sort form of big function like comparator(sort
        // two object)
        Arrays.sort(chain, Comparator.comparingDouble(o -> o[2]));

        int maxachain = 1;
        val2.add(chain[0][0]);
        int endval = chain[0][2];
        for (int i = 1; i < end.length; i++) {
            if (endval <= chain[i][1]) {
                maxachain++;
                endval = chain[i][2];
                val2.add(chain[i][0]);
            }
        }

        System.out.println(maxachain);
        for (int i = 0; i < val2.size(); i++) {
            System.out.print("A" + val2.get(i) + " ");
        }
    }
}
