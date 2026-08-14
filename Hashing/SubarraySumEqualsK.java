/*
    Problem: Subarray Sum Equals K
    Platform: LeetCode 560
    Level: Medium
    Approach: Prefix Sum + HashMap
    Time Complexity: O(n)
    Space Complexity: O(n)
*/

package Hashing;
import java.util.HashMap;
public class SubarraySumEqualsK {
    public static int subArrayCount(int[] nums , int k){
        HashMap<Integer , Integer> map = new HashMap<>();
        map.put(0,1);
        int preSum = 0;
        int count = 0;
        for(int i = 0 ; i < nums.length ; i++){
            preSum += nums[i];
            count += map.getOrDefault((preSum - k), 0);
            map.put(preSum , map.getOrDefault(preSum,0) + 1 );
        }
        return count;
    }
    public static void main(String args[]){
        int[] nums = {1,2,3};
        System.out.println(subArrayCount(nums, 3));
    }
}
