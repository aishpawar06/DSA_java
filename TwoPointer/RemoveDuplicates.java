/*
    Problem: Remove Duplicates from a Sorted Array
    Platform: LeetCode 26
    Level: Easy
    Approach: Two pointer
    Time Complexity: O(n)
    Space Complexity: O(1)
*/
package TwoPointer;

class RemoveDuplicates {

    public static int removeDuplicates(int[] nums) {
        if(nums.length==0) return 0;
        int prev = 0 ;
        int next = 0;
        while(next < nums.length){
            if(nums[prev] != nums[next]){
                nums[prev+1] = nums[next];
                prev++;
            }
            next++;
        }
        return prev+1;
    }

    public static void main(String[] args) {

        int[] nums = {1, 1, 2, 2, 3, 4, 4};

        int k = removeDuplicates(nums);

        System.out.println("Number of unique elements: " + k);

        System.out.print("Array after removing duplicates: ");
        for(int i = 0; i < k; i++) {
            System.out.print(nums[i] + " ");
        }
    }
}