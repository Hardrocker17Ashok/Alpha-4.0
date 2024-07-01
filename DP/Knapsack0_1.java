public class Knapsack0_1 {
    // solve by Recursion
    public static int findByRec(int value[], int waight[], int total, int n) {
        // we will solve from last element here 'n' means last element of waight of last
        // value
        // and total is total value whose should be only contain in bag
        if (total == 0 || n == 0) {
            return 0;
        }
        // for valid condition
        if (waight[n - 1] <= total) {
            // if element will be include in bag
            int ans1 = value[n - 1] + findByRec(value, waight, total - waight[n - 1], n - 1);
            // if note Include in bag
            int ans2 = findByRec(value, waight, total, n - 1);
            return Math.max(ans1, ans2);
        }
        // for invalid condition
        else {
            return findByRec(value, waight, total, n - 1);
        }
    }

    // solve by Memoization(DP)
    public static int findByMemoization(int value[], int waight[], int total, int n, int dp[][]) {

        if (total == 0 || n == 0) {
            return 0;
        }
        // here n means last index for element value and totla is size of bag capacity
        if (dp[n][total] != 0) {
            return dp[n][total];
        }
        // for valid condition
        if (waight[n - 1] <= total) {
            // if element will be include in bag
            int ans1 = value[n - 1] + findByMemoization(value, waight, total - waight[n - 1], n - 1, dp);
            // if note Include in bag
            int ans2 = findByMemoization(value, waight, total, n - 1, dp);
            dp[n][total] = Math.max(ans1, ans2);
            return dp[n][total];
        }
        // for invalid condition
        else {
            dp[n][total] = findByMemoization(value, waight, total, n - 1, dp);
            return dp[n][total];
        }
    }

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
                    dp[i][j] = Math.max(value[i - 1] + dp[i-1][j - waight[i - 1]], dp[i - 1][j]);
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
        int dp[][] = new int[value.length + 1][cap + 1];
        System.out.println("Total value is with recursion = " + findByRec(value, waight, cap, waight.length));
        System.out.println(
                "Total value is with memoization = " + findByMemoization(value, waight, cap, waight.length, dp));
        System.out.println("Total value is with tebulation = " + findByTebulation(value, waight, cap));

    }
}
