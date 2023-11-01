package sliding_window;

public class BinaryArrayMaxOnesCalculator {

    public int longestOnes(int[] nums, int flipsAllowed) {
        int left = 0, right;
        for (right = 0; right < nums.length; ++right) {
            if (nums[right] == 0) flipsAllowed--;
            if (flipsAllowed < 0 && nums[left++] == 0) flipsAllowed++;
        }
        return right - left;
    }

    public static void main(String[] args) {

        BinaryArrayMaxOnesCalculator calculator = new BinaryArrayMaxOnesCalculator();

        assert calculator.longestOnes(new int[]{1,1,1,0,0,0,1,1,1,1,0}, 2) == 6 : "Test case 1 failed";
        assert calculator.longestOnes(new int[]{0,0,1,1,0,0,1,1,1,0,1,1,0,0,0,1,1,1,1}, 3) == 10 : "Test case 2 failed";

        System.out.println("All test cases passed!");
    }
}
