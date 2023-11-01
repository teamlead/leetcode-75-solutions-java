package sliding_window;

public class BinarySubarrayCalculator {

    public int longestSubarray(int[] nums) {
        int start = 0, end, zeroCount = 1, maxLength = 0;
        for (end = 0; end < nums.length; ++end) {
            if (nums[end] == 0) {
                zeroCount--;
            }
            while (zeroCount < 0) {
                if (nums[start] == 0) {
                    zeroCount++;
                }
                start++;
            }
            maxLength = Math.max(maxLength, end - start);
        }
        return maxLength;
    }

    public static void main(String[] args) {

        BinarySubarrayCalculator calculator = new BinarySubarrayCalculator();

        assert calculator.longestSubarray(new int[]{1, 1, 0, 1}) == 3 : "Test case 1 failed";
        assert calculator.longestSubarray(new int[]{0, 1, 1, 1, 0, 1, 1, 0, 1}) == 5 : "Test case 2 failed";
        assert calculator.longestSubarray(new int[]{1, 1, 1}) == 2 : "Test case 3 failed";

        System.out.println("All test cases passed!");
    }
}
