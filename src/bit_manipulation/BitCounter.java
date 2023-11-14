package bit_manipulation;

public class BitCounter {

    public int[] countBits(int num) {
        int[] result = new int[num + 1];
        for (int i = 1; i <= num; i++) {
            result[i] = result[i >> 1] + (i & 1);
        }
        return result;
    }

    public static void main(String[] args) {
        BitCounter bitCounter = new BitCounter();

        assert java.util.Arrays.equals(bitCounter.countBits(2), new int[]{0, 1, 1}) : "Test case 1 failed";
        assert java.util.Arrays.equals(bitCounter.countBits(5), new int[]{0, 1, 1, 2, 1, 2}) : "Test case 2 failed";

        System.out.println("All test cases passed!");
    }
}
