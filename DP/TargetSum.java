public class TargetSum {
    // solve by Tebulation(DP)
    public static boolean findByTebulation(int value[], int target) {
        int n = value.length;
        boolean dp[][] = new boolean[n + 1][target + 1];
        for (int i = 0; i < n + 1; i++) {
            dp[i][0] = true;
        }

        for (int i = 1; i < n + 1; i++) {
            for (int j = 1; j < target + 1; j++) {
                int v = value[i - 1];
                // include
                if (v <= j && dp[i - 1][j - v] == true) {
                    dp[i][j] = true;
                }
                // excluded
                else if (dp[i - 1][j] == true) {
                    dp[i][j] = true;
                }

            }
        }
        return dp[n][target];
    }

    public static void main(String[] args) {
        int value[] = { 30, 40, 100, 10, 120 };
        int target = 5;
        System.out.println(findByTebulation(value, target));
    }
}
