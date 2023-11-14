package heap_priority_queue;

import java.util.Arrays;
import java.util.PriorityQueue;

public class MaxScoreCalculator {

    public long maxScore(int[] speed, int[] efficiency, int k) {
        int n = speed.length;
        int[][] ess = new int[n][2];
        for (int i = 0; i < n; ++i)
            ess[i] = new int[] {efficiency[i], speed[i]};
        Arrays.sort(ess, (a, b) -> b[0] - a[0]);
        PriorityQueue<Integer> pq = new PriorityQueue<>(k, (a, b) -> a - b);
        long res = 0, sumS = 0;
        for (int[] es : ess) {
            pq.add(es[1]);
            sumS = (sumS + es[1]);
            if (pq.size() > k) sumS -= pq.poll();
            if (pq.size() == k) res = Math.max(res, (sumS * es[0]));
        }
        return res;
    }

    public static void main(String[] args) {
        MaxScoreCalculator calculator = new MaxScoreCalculator();

        int[] nums1A = {1,3,3,2}, nums1B = {2,1,3,4}; int k1 = 3;
        assert calculator.maxScore(nums1A, nums1B, k1) == 12 : "Test case 1 failed";

        int[] nums2A = {4,2,3,1,1}, nums2B = {7,5,10,9,6}; int k2 = 1;
        assert calculator.maxScore(nums2A, nums2B, k2) == 30 : "Test case 2 failed";

        System.out.println("All test cases passed!");
    }
}
