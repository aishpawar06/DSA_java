/*
    Problem: Remove Duplicates from a Sorted Array
    Platform: LeetCode
    Level: Easy
    Approach: Two pointer technique - maintain a pointer for unique elements
    Time Complexity: O(n)
    Space Complexity: O(1)
*/
package Arrays;

class RemoveDuplicates {

    public static int remove(int[] nums) {
        if(nums.length == 0) return 0;

        int k = 1;

        for(int i = 1; i < nums.length; i++) {
            if(nums[i] != nums[k - 1]) {
                nums[k] = nums[i];
                k++;
            }
        }

        return k;
    }

    public static void main(String[] args) {

        int[] nums = {1, 1, 2, 2, 3, 4, 4};

        int k = remove(nums);

        System.out.println("Number of unique elements: " + k);

        System.out.print("Array after removing duplicates: ");
        for(int i = 0; i < k; i++) {
            System.out.print(nums[i] + " ");
        }
    }
}