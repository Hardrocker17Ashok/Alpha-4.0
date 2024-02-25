package Greedy_Algo;

import java.util.*;
import java.util.ArrayList;
import java.util.Comparator;

public class ActivitySelection {
    public static void main(String[] args) {
        // // it will bi right than end time is sorted
        // // in this problem we find that a person how many work will be complete at a
        // // time
        // // there are two array is given(start time of work and second end time of
        // work)
        // // here two work activity is possible A0 and A2
        // // beecause when work start 10 than end 20 and if this man move second
        // activity
        // // than second activity
        // // work was already started that's why he leave this activity
        // // and move further and choose 2nd activity and see that A2 start after A0
        // // activity
        // // so we can choose A2
        // // and final answer is A0 and A2;

        // int start[] = { 10, 12, 20 };
        // int end[] = { 20, 25, 30 };

        // // for store activity
        // ArrayList<Integer> val1 = new ArrayList<>();
        // int maxactivity = 1;
        // int endval = end[0];
        // val1.add(0);
        // for (int i = 1; i < start.length; i++) {
        // if (endval <= start[i]) {
        // maxactivity++;
        // endval = end[i];
        // val1.add(i);
        // }
        // }
        // System.out.println(maxactivity);
        // for (int i = 0; i < val.size(); i++) {
        // System.out.print("A" + val1.get(i) + " ");
        // }

        System.out.println("If end time is not sorted");
        // when end time is not sorted than we declare 2D Array for ith row and 3 column
        // first column store index of array second column store start value and third
        // column
        // store end value
        int start[] = { 10, 12, 20, 12 };
        int end[] = { 20, 15, 30, 25 };
        int sorted[][] = new int[start.length][3];
        ArrayList<Integer> val2 = new ArrayList<>();

        for (int i = 0; i < start.length; i++) {
            sorted[i][0] = i;
            sorted[i][1] = start[i];
            sorted[i][2] = end[i];
        }

        // now we will sort this 2D array
        // it is call lambda function->sort form of big function like comparator(sort
        // two object)
        Arrays.sort(sorted, Comparator.comparingDouble(o -> o[2]));

        int maxactivity = 1;
        val2.add(sorted[0][0]);
        int endval = sorted[0][2];
        for (int i = 1; i < end.length; i++) {
            if (endval <= sorted[i][1]) {
                maxactivity++;
                endval = sorted[i][2];
                val2.add(sorted[i][0]);
            }
        }

        System.out.println(maxactivity);
        for (int i = 0; i < val2.size(); i++) {
            System.out.print("A" + val2.get(i) + " ");
        }
    }
}
