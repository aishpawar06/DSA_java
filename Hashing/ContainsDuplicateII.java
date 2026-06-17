/*
    Problem: Contains Duplicate II
    Platform: LeetCode 219
    Level: Easy
    Approach: HashMap to store value → last index and check distance
    Time Complexity: O(n)
    Space Complexity: O(n)
*/

package Hashing;
import java.util.*;
public class ContainsDuplicateII{
    public static boolean containsNearbyDuplicate(int[] nums, int k) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i = 0 ; i < nums.length ; i++){
            if(map.containsKey(nums[i])){
                if(i - map.get(nums[i]) <= k){
                    return true;
                }
            }
            map.put(nums[i],i);
        }
        return false;
    }

    public static void main(String[] args) {
        int[] nums = {1,2,3,1,2,3};
        int k = 2;

        System.out.println(containsNearbyDuplicate(nums, k));
    }

}