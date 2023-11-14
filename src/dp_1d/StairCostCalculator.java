package dp_1d;

public class StairCostCalculator {

    private int[] dp;

    public int minCostClimbingStairs(int[] cost) {
        int n = cost.length;
        dp = new int[n];
        return Math.min(minCost(cost, n - 1), minCost(cost, n - 2));
    }

    private int minCost(int[] cost, int n) {
        if (n < 0) return 0;
        if (n == 0 || n == 1) return cost[n];
        if (dp[n] != 0) return dp[n];
        dp[n] = cost[n] + Math.min(minCost(cost, n - 1), minCost(cost, n - 2));
        return dp[n];
    }

    public static void main(String[] args) {
        StairCostCalculator calculator = new StairCostCalculator();

        int[] cost1 = {10, 15, 20};
        assert calculator.minCostClimbingStairs(cost1) == 15 : "Test case 1 failed";

        int[] cost2 = {1, 100, 1, 1, 1, 100, 1, 1, 100, 1};
        assert calculator.minCostClimbingStairs(cost2) == 6 : "Test case 2 failed";

        System.out.println("All test cases passed!");
    }
}
