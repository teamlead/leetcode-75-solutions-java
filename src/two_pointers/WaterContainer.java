package two_pointers;

public class WaterContainer {

    public int maxArea(int[] heights) {
        int start = 0;
        int end = heights.length - 1;
        int maxVolume = 0;

        while(start < end) {
            int width = end - start;
            int height = Math.min(heights[start], heights[end]);
            int volume = height * width;

            maxVolume = Math.max(maxVolume, volume);

            if(heights[start] < heights[end]) {
                start++;
            } else {
                end--;
            }
        }

        return maxVolume;
    }

    public static void main(String[] args) {

        WaterContainer container = new WaterContainer();

        assert container.maxArea(new int[]{1,8,6,2,5,4,8,3,7}) == 49 : "Test case 1 failed";
        assert container.maxArea(new int[]{1,1}) == 1 : "Test case 2 failed";

        System.out.println("All test cases passed!");
    }
}
