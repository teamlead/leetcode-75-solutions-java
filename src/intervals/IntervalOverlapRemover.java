package intervals;

import java.util.Arrays;

public class IntervalOverlapRemover {

    public int eraseOverlapIntervals(int[][] intervals) {
        if (intervals == null || intervals.length == 0) {
            return 0;
        }
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));
        int prevEnd = intervals[0][1];
        int count = 0;
        for (int i = 1; i < intervals.length; i++) {
            if (prevEnd > intervals[i][0]) {
                count++;
                prevEnd = Math.min(intervals[i][1], prevEnd);
            } else {
                prevEnd = intervals[i][1];
            }
        }
        return count;
    }

    public static void main(String[] args) {
        IntervalOverlapRemover remover = new IntervalOverlapRemover();

        assert remover.eraseOverlapIntervals(new int[][]{{1,2},{2,3},{3,4},{1,3}}) == 1 : "Test case 1 failed";
        assert remover.eraseOverlapIntervals(new int[][]{{1,2},{1,2},{1,2}}) == 2 : "Test case 2 failed";
        assert remover.eraseOverlapIntervals(new int[][]{{1,2},{2,3}}) == 0 : "Test case 3 failed";

        System.out.println("All test cases passed!");
    }
}
