package array_string;

public class ProductExceptSelf {

    public int[] calculateProduct(int[] nums) {
        int length = nums.length;
        int[] result = new int[length];

        int leftMultiplier = 1;
        for (int idx = 0; idx < length; idx++) {
            if (idx > 0) {
                leftMultiplier = leftMultiplier * nums[idx - 1];
            }
            result[idx] = leftMultiplier;
        }

        int rightMultiplier = 1;
        for (int idx = length - 1; idx >= 0; idx--) {
            if (idx < length - 1) {
                rightMultiplier = rightMultiplier * nums[idx + 1];
            }
            result[idx] *= rightMultiplier;
        }

        return result;
    }

    public static void main(String[] args) {

        ProductExceptSelf calculator = new ProductExceptSelf();

        int[] testInput1 = {1,2,3,4};
        int[] expectedOutput1 = {24,12,8,6};
        assert java.util.Arrays.equals(calculator.calculateProduct(testInput1), expectedOutput1) : "Test case 1 failed";

        int[] testInput2 = {-1,1,0,-3,3};
        int[] expectedOutput2 = {0,0,9,0,0};
        assert java.util.Arrays.equals(calculator.calculateProduct(testInput2), expectedOutput2) : "Test case 2 failed";

        System.out.println("All test cases passed!");
    }
}
