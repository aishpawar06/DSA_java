/*
    Problem: Missing Number
    Platform: LeetCode 268
    Level: Easy
    Approach: XOR of indices and array elements
    Time Complexity: O(n)
    Space Complexity: O(1)
*/

package Arrays;

public class MissingNumber {

    public static int missingNumber(int[] nums) {
        int xor1 = 0;
        int xor2 = 0;
        for(int i = 0 ; i < nums.length ; i++){
            xor1 ^= nums[i];
            xor2 ^= i;
        }
        xor2 ^= nums.length;
        return xor1^xor2; 
    }

    public static void main(String[] args) {
        int[] nums = {9,6,4,2,3,5,7,0,1};
        System.out.println("Missing number: " + missingNumber(nums));
    }
}