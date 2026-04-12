/*
    Problem: Two Sum
    Platform: LeetCode 1
    Level: Easy
    Approach: Use HashMap to store value → index and check for complement (target - current)
    Time Complexity: O(n)
    Space Complexity: O(n)
*/

package Arrays;

import java.util.HashMap;

public class TwoSum {
    public static int[] twoSum(int[] nums, int target){
        HashMap<Integer,Integer> result = new HashMap<>();
        for(int i = 0 ; i < nums.length ; i++){
            int needed = target-nums[i];
            if(result.containsKey(needed)){
                return new int[]{result.get(needed),i};
            }
            result.put(nums[i],i);
        }
        return new int[]{-1,-1};
    }

        public static void main(String[] args) {
        int[] nums = {2,7,11,15};
        int target = 9;

        int[] result = twoSum(nums, target);

        System.out.println(result[0] + " " + result[1]);
    }
    
}
