/*
    Problem: Find First and Last Position of Element in Sorted Array
    Platform: LeetCode 34
    Level: Medium
    Approach: Binary Search (find first and last occurrence separately)
    Time Complexity: O(log n)
    Space Complexity: O(1)
*/

package Arrays;

public class SearchRange {

    public static int findFirst(int[] nums, int target){
        int st = 0, end = nums.length - 1;
        int ans = -1;

        while(st <= end){
            int mid = st + (end - st)/2;

            if(nums[mid] == target){
                ans = mid;
                end = mid - 1;
            }
            else if(target < nums[mid]){
                end = mid - 1;
            }
            else{
                st = mid + 1;
            }
        }
        return ans;
    }

    public static int findLast(int[] nums, int target){
        int st = 0, end = nums.length - 1;
        int ans = -1;

        while(st <= end){
            int mid = st + (end - st)/2;

            if(nums[mid] == target){
                ans = mid;
                st = mid + 1;   // ✔ fixed
            }
            else if(target < nums[mid]){
                end = mid - 1;
            }
            else{
                st = mid + 1;
            }
        }
        return ans;
    }

    public static int[] searchRange(int[] nums, int target) {
        return new int[]{findFirst(nums, target), findLast(nums, target)};
    }

    public static void main(String[] args){
        int[] nums = {5,7,7,8,8,10};
        int target = 8;

        int[] res = searchRange(nums, target);

        System.out.println("First: " + res[0] + ", Last: " + res[1]);
    }
}