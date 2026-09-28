/*
    Problem: Find Minimum in Rotated Sorted Array
    Platform: LeetCode 153
    Level: Medium
    Approach: Binary Search
    Time Complexity: O(log n)
    Space Complexity: O(1)
*/

package BinarySearch;
class FindMinimumRotatedArray {
    public static int findMin(int[] nums) {
        int high = nums.length-1;
        int low = 0;
        while(low < high){
            int mid = low + (high - low)/2;
            if(nums[mid] < nums[high]){
                high = mid;
            }else if(nums[mid] > nums[high]){
                low = mid + 1;
            }
        }
        return nums[low];
    }
    public static void main(String[] args) {
        int[] nums = {4, 5, 6, 7, 0, 1, 2};

        int result = findMin(nums);

        System.out.println(result);
    }
}