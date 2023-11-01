package hash_map_set;

import java.util.*;
import java.util.stream.Collectors;

public class ArraysDifferenceFinder {

    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        Set<Integer> set1 = new HashSet<>(Arrays.stream(nums1).boxed().collect(Collectors.toSet()));  // convert nums1 to set
        Set<Integer> set2 = new HashSet<>(Arrays.stream(nums2).boxed().collect(Collectors.toSet()));  // convert nums2 to set

        List<Integer> diff1 = set1.stream().filter(num -> !set2.contains(num)).collect(Collectors.toList()); // nums1 diff nums2
        List<Integer> diff2 = set2.stream().filter(num -> !set1.contains(num)).collect(Collectors.toList()); // nums2 diff nums1

        return Arrays.asList(diff1, diff2);
    }

    public static void main(String[] args) {

        ArraysDifferenceFinder finder = new ArraysDifferenceFinder();

        List<List<Integer>> result1 = finder.findDifference(new int[] {1,2,3}, new int[] {2,4,6});
        assert result1.get(0).equals(Arrays.asList(1,3)) && result1.get(1).equals(Arrays.asList(4,6)) : "Test case 1 failed";

        List<List<Integer>> result2 = finder.findDifference(new int[] {1,2,3,3}, new int[] {1,1,2,2});
        assert result2.get(0).equals(Arrays.asList(3)) && result2.get(1).isEmpty() : "Test case 2 failed";

        System.out.println("All test cases passed!");
    }
}
