package prefix_sum;

import java.util.Arrays;

public class PivotFinder {

    public int pivotIndex(int[] nums) {
        int total = Arrays.stream(nums).sum();
        int leftSum = 0;

        for (int i = 0; i < nums.length; i++) {
            if (leftSum == total - leftSum - nums[i]) {
                return i;
            }
            leftSum += nums[i];
        }

        return -1;
    }

    public static void main(String[] args) {

        PivotFinder finder = new PivotFinder();

        assert finder.pivotIndex(new int[]{1,7,3,6,5,6}) == 3 : "Test case 1 failed";
        assert finder.pivotIndex(new int[]{1,2,3}) == -1 : "Test case 2 failed";
        assert finder.pivotIndex(new int[]{2,1,-1}) == 0 : "Test case 3 failed";

        System.out.println("All test cases passed!");
    }
}
