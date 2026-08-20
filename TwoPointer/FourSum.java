/*
    Problem: 4Sum
    Platform: LeetCode 18
    Level: Medium
    Approach: Sorting + Two Pointers
    Time Complexity: O(n³)
    Space Complexity: O(1) auxiliary space
    Output Space: O(n²) in the worst case
*/
package TwoPointer;
import java.util.*;
class FourSum {
    public static List<List<Integer>> fourSum(int[] nums, int target) {
            Arrays.sort(nums);
            List<List<Integer>> list = new ArrayList<>();
            for(int i = 0 ; i < nums.length ; i++){
                if(i > 0 && nums[i] == nums[i - 1]) continue;
                for(int j = i + 1 ; j < nums.length ; j++){
                    if(j > i + 1 && nums[j] == nums[j - 1]) continue;
                    int left = j + 1;
                    int right = nums.length - 1;
                    while(left < right){
                        long sum = (long)nums[i] + nums[j];
                        sum += nums[left];
                        sum += nums[right];
                        if(sum == target){
                            list.add(Arrays.asList(nums[i] , nums[j] , nums[left] , nums[right]));
                            left++;
                            right--;
                            while(left < right && nums[left] == nums[left - 1]) left++;
                            while(left < right && nums[right] == nums[right + 1]) right--; 
                        }else if(sum > target){
                            right--;
                        }else{
                            left++;
                        }
                    }
                }
            }
        return list;
    }
    public static void main(String[] args){
        int[] nums = {1, 0, -1, 0, -2, 2};
        int target = 0;

        List<List<Integer>> result = fourSum(nums, target);

        for (List<Integer> quadruplet : result) {
            System.out.println(quadruplet);
        }
    }
}