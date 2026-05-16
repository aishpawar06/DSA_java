/*
Problem: Trapping Rain Water
Platform: LeetCode 42
Level: Hard
Approach: Precompute leftMax and rightMax arrays to determine
water level at each index
Time Complexity: O(n)
Space Complexity: O(n)
*/
package Arrays;
public class TrappingRainWater {

    public static int trap(int[] height) {

        int[] leftMax = new int[height.length];
        int[] rightMax = new int[height.length];

        leftMax[0] = height[0];

        for(int i = 1; i < height.length; i++) {
            leftMax[i] = Math.max(leftMax[i - 1], height[i]);
        }

        rightMax[height.length - 1] = height[height.length - 1];

        for(int i = height.length - 2; i >= 0; i--) {
            rightMax[i] = Math.max(height[i], rightMax[i + 1]);
        }

        int trappedWater = 0;

        for(int i = 0; i < height.length; i++) {
            int waterLevel = Math.min(leftMax[i], rightMax[i]);
            trappedWater += (waterLevel - height[i]);
        }

        return trappedWater;
    }

    public static void main(String[] args) {

        int[] height = {4, 2, 0, 6, 3, 2, 5};

        int result = trap(height);

        System.out.println("Total Trapped Water: " + result);
    }
}