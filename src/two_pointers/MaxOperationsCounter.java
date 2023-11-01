package two_pointers;

import java.util.HashMap;

public class MaxOperationsCounter {

    public int maxOperations(int[] nums, int k) {
        HashMap<Integer, Integer> numberCount = new HashMap<>();
        int operations = 0;

        for (int num : nums) {
            if (numberCount.getOrDefault(k - num, 0) > 0) {
                operations++;
                numberCount.put(k - num, numberCount.get(k - num) - 1);
            } else {
                numberCount.put(num, numberCount.getOrDefault(num, 0) + 1);
            }
        }

        return operations;
    }

    public static void main(String[] args) {

        MaxOperationsCounter counter = new MaxOperationsCounter();

        assert counter.maxOperations(new int[]{1,2,3,4}, 5) == 2 : "Test case 1 failed";
        assert counter.maxOperations(new int[]{3,1,3,4,3}, 6) == 1 : "Test case 2 failed";

        System.out.println("All test cases passed!");
    }
}
