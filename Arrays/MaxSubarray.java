/*
    Problem: Maximum Subarray
    Platform: LeetCode 53
    Level: Medium
    Approach: Kadane’s Algorithm
              At each step, decide whether to start a new subarray
              from current element or extend the previous one.
    Time Complexity: O(n)
    Space Complexity: O(1)
*/

public class MaxSubarray {

    public static int maxSubArray(int[] nums) {
        int currSum = nums[0];
        int maxSum = nums[0];

        for(int i = 1; i < nums.length; i++){
            currSum = Math.max(nums[i], currSum + nums[i]);
            maxSum = Math.max(maxSum, currSum);
        }

        return maxSum;
    }

    public static void main(String[] args) {
        int[] nums = {-2,1,-3,4,-1,2,1,-5,4};

        int result = maxSubArray(nums);

        System.out.println("Maximum Subarray Sum: " + result);
    }
}
