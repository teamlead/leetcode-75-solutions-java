package bit_manipulation;

public class UniqueNumberFinder {

    public int singleNumber(int[] nums) {
        int answer = 0;
        for (int num : nums) {
            answer ^= num;
        }
        return answer;
    }

    public static void main(String[] args) {
        UniqueNumberFinder finder = new UniqueNumberFinder();

        assert finder.singleNumber(new int[]{2, 2, 1}) == 1 : "Test case 1 failed";
        assert finder.singleNumber(new int[]{4, 1, 2, 1, 2}) == 4 : "Test case 2 failed";
        assert finder.singleNumber(new int[]{1}) == 1 : "Test case 3 failed";

        System.out.println("All test cases passed!");
    }
}
