/*
    Problem: Maximum Subarray
    Platform: LeetCode 53
    Level: Medium
    Approach: Prefix Sum + Brute Force
              Calculate prefix sum array, then find sum of all subarrays
              using prefix differences.
    Time Complexity: O(n^2)
    Space Complexity: O(n)
*/
package Arrays;
public class MaxSubarray{

    public static int maxSubArray(int[] nums) {
        int n = nums.length;
        int maxSum = Integer.MIN_VALUE;

        int[] prefix = new int[n];
        prefix[0] = nums[0];

        for(int i = 1; i < n; i++){
            prefix[i] = prefix[i - 1] + nums[i];
        }

        for(int i = 0; i < n; i++){
            for(int j = i; j < n; j++){

                int currSum;
                if(i == 0){
                    currSum = prefix[j];
                } else {
                    currSum = prefix[j] - prefix[i - 1];
                }

                maxSum = Math.max(maxSum, currSum);
            }
        }

        return maxSum;
    }
    public static void main(String[] args) {
        int[] nums = {-2,1,-3,4,-1,2,1,-5,4};

        int result = maxSubArray(nums);

        System.out.println("Maximum Subarray Sum: " + result);
    }
}