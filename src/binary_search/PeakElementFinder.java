package binary_search;

public class PeakElementFinder {

    public int findPeakElement(int[] nums) {
        if (nums.length == 1) return 0; // single element

        int n = nums.length;

        // check if 0th/n-1th index is the peak element
        if (nums[0] > nums[1]) return 0;
        if (nums[n - 1] > nums[n - 2]) return n - 1;

        // search in the remaining array
        int start = 1;
        int end = n - 2;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (nums[mid] > nums[mid - 1] && nums[mid] > nums[mid + 1]) return mid;
            else if (nums[mid] < nums[mid - 1]) end = mid - 1;
            else start = mid + 1;
        }
        return -1; // dummy return statement
    }

    public static void main(String[] args) {
        PeakElementFinder finder = new PeakElementFinder();

        int[] nums1 = {1, 2, 3, 1};
        assert finder.findPeakElement(nums1) == 2 : "Test case 1 failed";

        int[] nums2 = {1, 2, 1, 3, 5, 6, 4};
        // This test case can return either 1 or 5 as both are correct answers.
        int result2 = finder.findPeakElement(nums2);
        assert result2 == 1 || result2 == 5 : "Test case 2 failed";

        System.out.println("All test cases passed!");
    }
}
