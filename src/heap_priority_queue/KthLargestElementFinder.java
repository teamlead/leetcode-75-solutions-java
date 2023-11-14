package heap_priority_queue;

import java.util.PriorityQueue;

public class KthLargestElementFinder {

    public int findKthLargest(int[] nums, int k) {
        final PriorityQueue<Integer> pq = new PriorityQueue<>();
        for (int val : nums) {
            pq.offer(val);
            if (pq.size() > k) {
                pq.poll();
            }
        }
        return pq.peek();
    }

    public static void main(String[] args) {
        KthLargestElementFinder finder = new KthLargestElementFinder();

        int[] nums1 = {3, 2, 1, 5, 6, 4};
        int k1 = 2;
        assert finder.findKthLargest(nums1, k1) == 5 : "Test case 1 failed";

        int[] nums2 = {3, 2, 3, 1, 2, 4, 5, 5, 6};
        int k2 = 4;
        assert finder.findKthLargest(nums2, k2) == 4 : "Test case 2 failed";

        System.out.println("All test cases passed!");
    }
}
