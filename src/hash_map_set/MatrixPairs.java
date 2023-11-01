package hash_map_set;

import java.util.HashMap;
import java.util.Map;
import java.util.Arrays;

public class MatrixPairs {

    public int countEqualPairs(int[][] matrix) {
        Map<String, Integer> rowRepresentationCount = new HashMap<>();

        for (int[] row : matrix) {
            String rowString = Arrays.toString(row);
            rowRepresentationCount.put(rowString, rowRepresentationCount.getOrDefault(rowString, 0) + 1);
        }

        int equalPairCount = 0;
        int matrixSize = matrix.length;

        for (int colIndex = 0; colIndex < matrixSize; colIndex++) {
            int[] column = new int[matrixSize];
            for (int rowIndex = 0; rowIndex < matrixSize; rowIndex++) {
                column[rowIndex] = matrix[rowIndex][colIndex];
            }
            String colString = Arrays.toString(column);
            equalPairCount += rowRepresentationCount.getOrDefault(colString, 0);
        }

        return equalPairCount;
    }

    public static void main(String[] args) {
        MatrixPairs checker = new MatrixPairs();

        assert checker.countEqualPairs(new int[][]{{3,2,1},{1,7,6},{2,7,7}}) == 1 : "Test case 1 failed";
        assert checker.countEqualPairs(new int[][]{{3,1,2,2},{1,4,4,5},{2,4,2,2},{2,4,2,2}}) == 3 : "Test case 2 failed";

        System.out.println("All test cases passed!");
    }
}
