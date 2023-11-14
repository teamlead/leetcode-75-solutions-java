package dp_1d;

public class TribonacciCalculator {

    public int tribonacci(int n) {
        int[] dp = {0, 1, 1};
        for (int i = 3; i <= n; ++i) {
            dp[i % 3] = dp[0] + dp[1] + dp[2];
        }
        return dp[n % 3];
    }

    public static void main(String[] args) {
        TribonacciCalculator calculator = new TribonacciCalculator();

        assert calculator.tribonacci(4) == 4 : "Test case 1 failed";
        assert calculator.tribonacci(25) == 1389537 : "Test case 2 failed";

        System.out.println("All test cases passed!");
    }
}
