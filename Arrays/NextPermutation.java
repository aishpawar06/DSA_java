/*
    Problem: Next Permutation
    Platform: LeetCode 31
    Level: Medium
    Approach: Pivot Identification + Suffix Reversal
    Time Complexity: O(n)
    Space Complexity: O(1)
*/
package Arrays;

public class NextPermutation {
    public static void reverse(int st , int end , int[] arr){
        while(st < end){
            int temp = arr[st];
            arr[st] = arr[end];
            arr[end] = temp;
            st++;
            end--;
        }
    }
    public static void nextPermutation(int[] nums){
        int pivot = -1;
        for(int i = nums.length-2 ; i >= 0 ; i--){
            if(nums[i] < nums[i+1]){
                pivot = i;
                break;
            }
        }
        if(pivot == -1){
            reverse(0,nums.length-1,nums);
            return;
        }
        for(int i = nums.length-1 ; i>=0 ; i--){
            if(nums[i] > nums[pivot]){
                int temp = nums[i];
                nums[i] = nums[pivot];
                nums[pivot] = temp;
                break;
            }
        }
        reverse(pivot+1,nums.length-1,nums);
    }

    public static void main(String[] args){
        int[] nums = {2,3,1};
        nextPermutation(nums);
        for(int i = 0 ; i < nums.length ; i++){
            System.out.print(nums[i]+" ");
        }
    }
    
}
