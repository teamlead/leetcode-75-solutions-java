package dp_1d;

public class HouseRobber {

    public int rob(int[] nums) {
        if (nums.length == 0) return 0;
        int[] memo = new int[nums.length + 1];
        memo[0] = 0;
        memo[1] = nums[0];
        for (int i = 1; i < nums.length; i++) {
            int val = nums[i];
            memo[i + 1] = Math.max(memo[i], memo[i - 1] + val);
        }
        return memo[nums.length];
    }

    public static void main(String[] args) {
        HouseRobber robber = new HouseRobber();

        int[] nums1 = {1, 2, 3, 1};
        assert robber.rob(nums1) == 4 : "Test case 1 failed";

        int[] nums2 = {2, 7, 9, 3, 1};
        assert robber.rob(nums2) == 12 : "Test case 2 failed";

        System.out.println("All test cases passed!");
    }
}
