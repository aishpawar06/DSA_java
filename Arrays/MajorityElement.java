/*
    Problem: Majority Element
    Platform: LeetCode 169
    Level: Easy
    Approach: Moore's Voting Algorithm
    Time Complexity: O(n)
    Space Complexity: O(1)
*/
package Arrays;

public class MajorityElement {

    public static int majorityElement(int[] nums) {
        int candidate = 0;
        int count = 0;
        for(int i = 0 ; i < nums.length ; i++){
            if(count == 0){
                candidate = nums[i];
            }
            if(nums[i] == candidate){
                count++;
            }else{
                count--;
            }
        }
        return candidate;
    }

    public static void main(String[] args) {

        int[] nums = {2, 2, 1, 1, 1, 2, 2};

        int result = majorityElement(nums);

        System.out.println("Majority Element: " + result);
    }
}