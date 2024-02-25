package Backtracking;

public class GridWay {
    public static int Grid(int i, int j, int n, int m) {
        if (i == n - 1 && j == n - 1) { //for last cell
            return 1;
        } else if (i == n || j == n) { // for cross boundry
            return 0;
        }

        // check for all right and left cell one by one with backtracking
        // use time complexity is O(2 ki power n) that is not good
        int w1 = Grid(i + 1, j, n, m);
        int w2 = Grid(i, j + 1, n, m);
        return w1 + w2;
    }

    public static void main(String[] args) {
        int n = 3, m = 3;
        System.out.println("Totle way is = "+Grid(0, 0, n, m));
    }
}
