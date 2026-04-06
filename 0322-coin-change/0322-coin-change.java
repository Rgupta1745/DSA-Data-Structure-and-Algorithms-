class Solution {

    // Function to find minimum coins required
    public static int coinChange(int[] coins, int amount) {

        // Define a large value (greater than any possible answer)
        int INF = amount + 1;

        // dp[i] = minimum coins needed to make amount i
        int[] dp = new int[amount + 1];

        // Initialize all values with INF (unreachable)
        Arrays.fill(dp, INF);

        // Base case: 0 coins needed to make amount 0
        dp[0] = 0;

        // Loop through each coin
        for (int coin : coins) {

            // Try to build all amounts starting from this coin
            for (int i = coin; i <= amount; i++) {

                // If we take this coin:
                // 1 + coins needed for remaining amount
                dp[i] = Math.min(dp[i], dp[i - coin] + 1);
            }
        }

        // If dp[amount] still INF → not possible
        if (dp[amount] > amount) {
            return -1;
        }

        return dp[amount];
    }

}