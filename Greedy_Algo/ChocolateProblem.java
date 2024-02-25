package Greedy_Algo;

import java.util.*;;

public class ChocolateProblem {
    public static void main(String[] args) {
        int n = 4, m = 6;
        // given two array cost of cuts
        int costver[] = { 2, 1, 3, 1, 4 }; // m-1
        int costhor[] = { 4, 1, 2 }; // n-1

        // find minimum cost of all pieces until all pieces is single squre
        // sort in incresing order
        Arrays.sort(costhor);
        Arrays.sort(costver);
        int h = costhor.length - 1, v = costver.length - 1;
        int hp = 1, vp = 1;
        int cost = 0;
        while (0 <= h && 0 <= v) {
            if (costhor[h] >= costver[v]) {
                cost += costhor[h] * vp;
                h--;
                hp++;
            } else {
                cost += costver[v] * hp;
                v--;
                vp++;
            }
        }
        while (0 <= h) {
            cost += costhor[h] * vp;
            h--;
            hp++;
        }
        while (0 <= v) {
            cost += costver[v] * hp;
            v--;
            vp++;
        }
        System.out.println("Totle cost = " + cost);
    }
}
