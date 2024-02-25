package Backtracking;

public class GrideWayTrick {
    /*
     * we know that in the privious question time complexty is lot of
     * therefor we will solve this problam in linear time complexity
     * we use permutation for all posibillity
     * for example in gride we can get final point as a right an left move
     * so ther are become two combination
     * LEFT AND RIGHT
     * FOR FIRST COMBINATION LR AND FOR SECOND LR
     * 
     * like n and m is row and coloumn respectvally
     * than find all ways to reached (n-1,m-1) index
     * 
     * sum easy formula is->
     * totle wayes => [((n-1)+(m-1))!/(n-1)!*(m-1)!]
     */
    public static int funk1(int n, int m) {
        int a = ((n - 1) + (m - 1));
        int p = 1;
        for (int i = 1; i <= a; i++) {
            p *= i;
        }
        return p;
    }

    public static int funk2(int n, int m) {
        int a = 1, b = 1;
        for (int i = 1; i < n; i++) {
            a *= i;
        }
        for (int i = 1; i < m; i++) {
            b *= i;
        }
        return a * b;
    }

    public static void main(String[] args) {
        int n = 3, m = 3;
        int x = funk1(n, m);
        int y = funk2(n, m);
        System.out.println("the totle ways is => " + x / y);
    }
}
