/*
    Problem: Sort Colors
    Platform: LeetCode 75
    Level: Medium
    Approach: Dutch National Flag Algorithm (Three Pointers)
              Partition the array into three regions using
              low, mid, and high pointers.
    Time Complexity: O(n)
    Space Complexity: O(1)
*/

package Arrays;
public class SortColors{
    public static void sort(int[] nums){
        int low = 0;
        int mid = 0;
        int high = nums.length-1;
        while(mid<=high){
            if(nums[mid] == 0){
                int temp = nums[mid];
                nums[mid] = nums[low];
                nums[low] = temp;
                mid++;
                low++;
            }else if(nums[mid] == 1){
                mid++;
            }else{
                int temp = nums[high];
                nums[high] = nums[mid];
                nums[mid] = temp;
                high--;
            }
        }
    }

    public static void main(String args[]){
        int[] nums = {0,2,1,1,2,2,0,0,1,0,1};
        sort(nums);
        for(int i = 0 ; i < nums.length ; i++){
            System.out.print(nums[i] + " ");
        }
    }
}