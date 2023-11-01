package array_string;

public class IncreasingTriplet {

    public boolean hasIncreasingTriplet(int[] numbers) {
        int firstMin = Integer.MAX_VALUE, secondMin = Integer.MAX_VALUE;
        for (int number : numbers) {
            if (number <= firstMin) {
                firstMin = number;
            } else if (number <= secondMin) {
                secondMin = number;
            } else {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {

        IncreasingTriplet checker = new IncreasingTriplet();

        int[] testInput1 = {1,2,3,4,5};
        assert checker.hasIncreasingTriplet(testInput1) == true : "Test case 1 failed";

        int[] testInput2 = {5,4,3,2,1};
        assert checker.hasIncreasingTriplet(testInput2) == false : "Test case 2 failed";

        int[] testInput3 = {2,1,5,0,4,6};
        assert checker.hasIncreasingTriplet(testInput3) == true : "Test case 3 failed";

        System.out.println("All test cases passed!");
    }
}
