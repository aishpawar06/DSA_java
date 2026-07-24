/*
    Problem: Longest Consecutive Sequence
    Platform: LeetCode 128
    Level: Medium
    Approach: Hashing (HashSet)
    Time Complexity: O(n)
    Space Complexity: O(n)
*/

package Hashing;
import java.util.*;

public class LongestConsecutiveSequence {
    public static int longestConsecutive(int[] nums){
        if(nums.length == 0) return 0;
        int largest = 1;
        HashSet<Integer> set = new HashSet<>();
        for(int i = 0 ; i < nums.length ; i++){
            set.add(nums[i]);
        }
        for(int num : set){
            if(!set.contains(num-1)){
                int count = 1;
                int element = num;
                while(set.contains(element+1)){
                    count++;
                    element++;
                }
                largest = Math.max(largest,count);
            }
        }
        return largest;
    }

    public static void main(String args[]){
        int[] nums = {100,4,200,1,3,2};
        System.out.println(longestConsecutive(nums));
    }
}
