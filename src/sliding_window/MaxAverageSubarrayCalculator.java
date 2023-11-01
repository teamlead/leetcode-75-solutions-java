package sliding_window;

public class MaxAverageSubarrayCalculator {

    public double findMaxAverage(int[] numbers, int subarrayLength) {
        long currentSum = 0;
        for (int i = 0; i < subarrayLength; i++) {
            currentSum += numbers[i];
        }
        long maxSum = currentSum;

        for (int i = subarrayLength; i < numbers.length; i++) {
            currentSum += numbers[i] - numbers[i - subarrayLength];
            maxSum = Math.max(maxSum, currentSum);
        }

        return maxSum / 1.0 / subarrayLength;
    }

    public static void main(String[] args) {

        MaxAverageSubarrayCalculator calculator = new MaxAverageSubarrayCalculator();

        assert Math.abs(calculator.findMaxAverage(new int[]{1,12,-5,-6,50,3}, 4) - 12.75) < 1e-5 : "Test case 1 failed";
        assert Math.abs(calculator.findMaxAverage(new int[]{5}, 1) - 5.0) < 1e-5 : "Test case 2 failed";

        System.out.println("All test cases passed!");
    }
}
