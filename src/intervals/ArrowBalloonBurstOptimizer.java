package intervals;

import java.util.Arrays;

public class ArrowBalloonBurstOptimizer {

    public int findMinArrowShots(int[][] points) {
        if (points.length == 0) return 0;

        Arrays.sort(points, (a, b) -> Integer.compare(a[1], b[1]));
        int arrows = 1;
        int arrowLimit = points[0][1];

        for (int[] point : points) {
            if (point[0] > arrowLimit) {
                arrows++;
                arrowLimit = point[1];
            }
        }
        return arrows;
    }

    public static void main(String[] args) {
        ArrowBalloonBurstOptimizer optimizer = new ArrowBalloonBurstOptimizer();

        assert optimizer.findMinArrowShots(new int[][]{{10,16},{2,8},{1,6},{7,12}}) == 2 : "Test case 1 failed";
        assert optimizer.findMinArrowShots(new int[][]{{1,2},{3,4},{5,6},{7,8}}) == 4 : "Test case 2 failed";
        assert optimizer.findMinArrowShots(new int[][]{{1,2},{2,3},{3,4},{4,5}}) == 2 : "Test case 3 failed";

        System.out.println("All test cases passed!");
    }
}
