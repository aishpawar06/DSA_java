/*
    Problem: Single Number
    Platform: LeetCode 136 
    Level: Easy
    Approach: XOR - duplicates cancel out
    Time Complexity: O(n)
    Space Complexity: O(1)
*/

package Arrays;

public class SingleNumber {

    public static int singleNumber(int[] nums) {
        int res = 0;

        for(int num : nums){
            res ^= num;
        }

        return res;
    }

    public static void main(String[] args) {
        int[] nums = {4,1,2,1,2};
        System.out.println("Single number: " + singleNumber(nums));
    }
}