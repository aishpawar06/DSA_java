/*
    Problem: Find First and Last Position of Element in Sorted Array
    Platform: LeetCode 34
    Level: Medium
    Approach: Binary search twice to find first and last occurrence
    Time Complexity: O(log n)
    Space Complexity: O(1)
*/
package Arrays;
public class FindFirstAndLastPosition{

    public static int findFirst(int[] nums, int target){
        int ans = -1;
        int st=0,end = nums.length;
        while(st<=end){
            int mid = st + (end-st)/2;
            if(target == nums[mid]){
                ans = mid;
                end = mid - 1;
            }else if(target < nums[mid]){
                end = mid - 1;
            }else{
                st = mid + 1;
            }
        }
        return ans;
    }
    
    public static int findLast(int[] nums, int target){
        int ans = -1;
        int st=0,end = nums.length;
        while(st<=end){
            int mid = st + (end-st)/2;
            if(target == nums[mid]){
                ans = mid;
                st = mid + 1;
            }else if(target < nums[mid]){
                end = mid - 1;
            }else{
                st = mid + 1;
            }
        }
        return ans;
    }

    public static int[] searchRange(int[] nums, int target){
        int[] result = new int[2];
        result[0] = findFirst(nums,target);
        result[1] = findLast(nums,target);
        return result;
    }
   public static void main(String[] args) {
        int[] nums = {5,7,7,8,8,10};
        int target = 8;

        int[] res = searchRange(nums, target);

        System.out.println("First: " + res[0] + ", Last: " + res[1]);
    }
}

