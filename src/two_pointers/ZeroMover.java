package two_pointers;

public class ZeroMover {

    public void moveZeroes(int[] arr) {
        int nonZeroIndex = 0;

        for (int num : arr) {
            if (num != 0) {
                arr[nonZeroIndex] = num;
                nonZeroIndex++;
            }
        }

        while (nonZeroIndex < arr.length) {
            arr[nonZeroIndex] = 0;
            nonZeroIndex++;
        }
    }

    public static void main(String[] args) {

        ZeroMover mover = new ZeroMover();

        int[] testInput1 = {0,1,0,3,12};
        mover.moveZeroes(testInput1);
        assert java.util.Arrays.equals(testInput1, new int[]{1,3,12,0,0}) : "Test case 1 failed";

        int[] testInput2 = {0};
        mover.moveZeroes(testInput2);
        assert java.util.Arrays.equals(testInput2, new int[]{0}) : "Test case 2 failed";

        System.out.println("All test cases passed!");
    }
}
