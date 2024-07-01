public class UnboundedKnapsack {
    // solve by Tebulation(DP)
    public static int findByTebulation(int value[], int waight[], int total) {
        int n = value.length;
        int dp[][] = new int[n + 1][total + 1];
        for (int i = 0; i < n + 1; i++) {
            dp[i][0] = 0;
        }
        for (int j = 0; j < total + 1; j++) {
            dp[0][j] = 0;
        }
        for (int i = 1; i < n + 1; i++) {
            for (int j = 1; j < total + 1; j++) {
                if (waight[i - 1] <= j) { // valid condition
                    // it is very similler to 0-1 knapsack bounded tebulation(dP) problem
                    // for unbounded it means no limit for add element in bag
                    // so here we will do (n) instade of (n-1) in dp array it means it will be count
                    // itself again and again untill
                    // condition is not fail
                    dp[i][j] = Math.max(value[i - 1] + dp[i][j - waight[i - 1]], dp[i - 1][j]);
                } else { // invalid condition
                    dp[i][j] = dp[i - 1][j];
                }

            }
        }
        return dp[n][total];
    }

    public static void main(String[] args) {
        int value[] = { 30, 40, 100, 10, 60 };
        int waight[] = { 3, 4, 5, 1, 6 };
        int cap = 10;
        System.out.println("Total value is with tebulation = " + findByTebulation(value, waight, cap));

    }
}
