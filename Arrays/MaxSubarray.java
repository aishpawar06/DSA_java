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
package Arrays;
public class MaxSubarray {

    public static int maxSubArray(int[] nums) {
        int sum = 0;
        int max = Integer.MIN_VALUE;
        for(int i = 0 ; i < nums.length ; i++){
            sum += nums[i];
            if(sum > max){
                max = sum;
            }
            if(sum < 0){
                sum = 0;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int[] nums = {5,4,-1,7,8};

        int result = maxSubArray(nums);

        System.out.println("Maximum Subarray Sum: " + result);
    }
}
