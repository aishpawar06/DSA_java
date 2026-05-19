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
        int maxWater = 0;
        int lptr = 0;
        int rptr = height.length-1;
        while(lptr<rptr){
            int water = Math.min(height[lptr],height[rptr]) * (rptr-lptr);
            maxWater = Math.max(maxWater,water);
            if(height[lptr]<height[rptr]){
                lptr++;
            }else{
                rptr--;
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