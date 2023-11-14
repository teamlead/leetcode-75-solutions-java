package dp_1d;

public class TilingCalculator {

    private static final int MOD = 1_000_000_007;

    public int numTilings(int N) {
        int T_prepre = 1, T_pre = 1;
        int T_up_pre = 0, T_down_pre = 0;

        for (int n = 2; n <= N; n++) {
            int T_cur = (int)((0L + T_prepre + T_pre + T_up_pre + T_down_pre) % MOD);
            int T_up_cur = (T_prepre + T_down_pre) % MOD;
            int T_down_cur = (T_prepre + T_up_pre) % MOD;

            T_prepre = T_pre;
            T_pre = T_cur;

            T_up_pre = T_up_cur;
            T_down_pre = T_down_cur;
        }

        return T_pre;
    }

    public static void main(String[] args) {
        TilingCalculator calculator = new TilingCalculator();

        assert calculator.numTilings(3) == 5 : "Test case 1 failed";
        assert calculator.numTilings(1) == 1 : "Test case 2 failed";

        System.out.println("All test cases passed!");
    }
}
