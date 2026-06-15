/*
    Problem: Container With Most Water
    Platform: LeetCode 11
    Level: Medium
    Approach: Two Pointers
    Time Complexity: O(n)
    Space Complexity: O(1)
*/

package TwoPointer;

public class ContainerWithMostWater{
    public static int maxArea(int[] height) {
        int maxWater = Integer.MIN_VALUE;
        int lp = 0;
        int rp = height.length - 1;
        while(rp > lp){
            int water = Math.min(height[lp] , height[rp]) * (rp - lp);
            maxWater = Math.max(maxWater , water);
            if(height[lp] < height[rp]){
                lp++;
            }else{
                rp--;
            }
        }
        return maxWater;
    }

    public static void main(String[] args) {

    int[] height = {1,8,6,2,5,4,8,3,7};

    int result = maxArea(height);

    System.out.println("Maximum Water Stored: " + result);
}
}