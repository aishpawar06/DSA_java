/*
    Problem: 3Sum
    Platform: LeetCode 15
    Level: Medium
    Approach: Sorting + Two Pointers
    Time Complexity: O(n²)
    Space Complexity: O(1) auxiliary space
*/

package TwoPointer;
import java.util.*;
public class ThreeSum{
    public static List<List<Integer>> threeSum(int[] nums){
        Arrays.sort(nums);
        List<List<Integer>> list = new ArrayList<>();
        for(int i = 0 ; i < nums.length ; i++){
            if(i > 0 && nums[i] == nums[i - 1]) continue;
            int left = i + 1;
            int right = nums.length - 1;
            while(left < right){
                int sum = nums[i] + nums[left] + nums[right];
                if(sum == 0){
                    list.add(Arrays.asList(nums[i] , nums[left] , nums[right]));
                    left++;
                    right--;
                    while(left < right && nums[left] == nums[left-1]) left++;
                    while(left < right && nums[right] == nums[right+1]) right--;
                }
                else if(sum < 0){
                    left++;
                }
                else{
                    right--;
                }
            }
        }
        return list;
    }
    public static void main(String[] args) {
        int[] arr = {-1, 0, 1, 2, -1, -4};
        List<List<Integer>> res = threeSum(arr);

        for (List<Integer> triplet : res) {
            for (int num : triplet) System.out.print(num + " ");
            System.out.println();
        }
    }
}