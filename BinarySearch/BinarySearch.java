/*
    Problem: Binary Search
    Platform: LeetCode 704
    Level: Easy
    Approach: Iterative binary search on sorted array
    Time Complexity: O(log n)
    Space Complexity: O(1)
*/

package BinarySearch;

public class BinarySearch {
    public static int search(int[] nums, int target) {
        int st = 0;
        int end = nums.length-1;
        while(st<=end){
            int mid = st + (end - st)/2;
            if(nums[mid] == target){
                return mid;
            }
            else if(target < nums[mid]){
                end = mid - 1;
            }
            else{
                st = mid + 1;
            }
        }
        return -1;
    }

    public static void main(String[] args){
        int[] arr = {-1,0,3,5,9,12};
        int result = search(arr, 3);
        if(result == -1){
            System.out.println("Target not found!");
        }else{
            System.out.println("Target found at index: " + result);

        }
    }
}

