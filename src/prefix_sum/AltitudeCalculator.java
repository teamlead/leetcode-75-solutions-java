package prefix_sum;

public class AltitudeCalculator {

    public int largestAltitude(int[] gain) {
        int currentAltitude = 0;
        int maxAltitude = 0;

        for (int altitudeChange : gain) {
            currentAltitude += altitudeChange;
            maxAltitude = Math.max(maxAltitude, currentAltitude);
        }

        return maxAltitude;
    }

    public static void main(String[] args) {

        AltitudeCalculator calculator = new AltitudeCalculator();

        assert calculator.largestAltitude(new int[]{-5, 1, 5, 0, -7}) == 1 : "Test case 1 failed";
        assert calculator.largestAltitude(new int[]{-4, -3, -2, -1, 4, 3, 2}) == 0 : "Test case 2 failed";

        System.out.println("All test cases passed!");
    }
}
