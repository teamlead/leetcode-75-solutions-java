package array_string;

public class CanPlaceFlowers {

    public boolean canPlaceFlowers(int[] garden, int numFlowers) {
        if (numFlowers == 0) return true;

        int availableSpots = 0;
        int index = 0;
        while (index < garden.length) {
            if (garden[index] == 0
                    && (index == 0 || garden[index - 1] == 0)
                    && (index == garden.length - 1 || garden[index + 1] == 0)) {
                garden[index] = 1;  // plant a flower
                availableSpots++;
                index += 2;  // skip next plot
            } else {
                index++;
            }
        }

        return availableSpots >= numFlowers;
    }

    public static void main(String[] args) {
        CanPlaceFlowers arrangement = new CanPlaceFlowers();

        assert arrangement.canPlaceFlowers(new int[]{1, 0, 0, 0, 1}, 1) == true : "Test case 1 failed";
        assert arrangement.canPlaceFlowers(new int[]{1, 0, 0, 0, 1}, 2) == false : "Test case 2 failed";

        System.out.println("All tests passed!");
    }

}
