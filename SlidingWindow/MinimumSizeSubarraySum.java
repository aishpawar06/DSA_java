/*
    Problem: Minimum Size Subarray Sum
    Platform: LeetCode 209
    Level: Medium
    Approach: Variable Size Sliding Window
    Time Complexity: O(n)
    Space Complexity: O(1)
*/

package SlidingWindow;

public class MinimumSizeSubarraySum {
    public static int minSubArrayLength(int[] nums, int target){
        int lp = 0;
        int min = Integer.MAX_VALUE;
        int sum = 0;
        for(int rp = 0 ; rp < nums.length ; rp++){
            sum+=nums[rp];
            while(sum>=target){
                min = Math.min(min,(rp-lp)+1);
                sum-=nums[lp];
                lp++;
            }
        }
        if(min==Integer.MAX_VALUE) return 0;
        return min;

    }

    public static void main(String[] args){
        int[] nums = {2,3,1,2,4,3};
        int target = 7;
        System.out.println(minSubArrayLength(nums, target));

    }
    
}
