package binary_search;

public class NumberGuesser {

    private int pick;

    public NumberGuesser(int pick) {
        this.pick = pick;
    }

    public int guessNumber(int n) {
        int left = 1, right = n;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            int result = guess(mid);
            if (result == 0) {
                return mid;
            } else if (result < 0) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return -1;
    }

    private int guess(int num) {
        return Integer.compare(pick, num);
    }

    public static void main(String[] args) {
        NumberGuesser guesser1 = new NumberGuesser(6);
        assert guesser1.guessNumber(10) == 6 : "Test case 1 failed";

        NumberGuesser guesser2 = new NumberGuesser(1);
        assert guesser2.guessNumber(1) == 1 : "Test case 2 failed";

        NumberGuesser guesser3 = new NumberGuesser(1);
        assert guesser3.guessNumber(2) == 1 : "Test case 3 failed";

        System.out.println("All test cases passed!");
    }
}
