package bit_manipulation;

public class BitFlipCalculator {

    public int minFlips(int a, int b, int c) {
        int flips = 0;
        while (a > 0 || b > 0 || c > 0) {
            int bitA = a & 1;
            int bitB = b & 1;
            int bitC = c & 1;

            if (bitC == 0) {
                flips += (bitA + bitB);
            } else {
                if (bitA == 0 && bitB == 0) {
                    flips += 1;
                }
            }

            a >>= 1;
            b >>= 1;
            c >>= 1;
        }
        return flips;
    }

    public static void main(String[] args) {
        BitFlipCalculator calculator = new BitFlipCalculator();

        assert calculator.minFlips(2, 6, 5) == 3 : "Test case 1 failed";
        assert calculator.minFlips(4, 2, 7) == 1 : "Test case 2 failed";
        assert calculator.minFlips(1, 2, 3) == 0 : "Test case 3 failed";

        System.out.println("All test cases passed!");
    }
}
