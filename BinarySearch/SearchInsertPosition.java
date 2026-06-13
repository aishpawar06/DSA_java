/*
    Problem: Search Insert Position
    Platform: LeetCode 35
    Level: Easy
    Approach: Binary Search – find target or return the index where it should be inserted
    Time Complexity: O(log n)
    Space Complexity: O(1)
*/
package BinarySearch;

public class SearchInsertPosition {

    public static int searchInsert(int[] nums, int target) {
        int st = 0;
        int end = nums.length - 1;

        while(st <= end){
            int mid = st + (end - st) / 2;

            if(nums[mid] == target){
                return mid;
            }
            else if(nums[mid] < target){
                st = mid + 1;
            }
            else{
                end = mid - 1;
            }
        }

        return st;
    }

    public static void main(String[] args) {
        int[] nums = {1,3,5,6};
        int target = 5;

        int result = searchInsert(nums, target);

        System.out.println("Position: " + result);
    }
}
