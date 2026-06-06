/*
    Problem: Move Zeroes
    Platform: LeetCode 283
    Level: Easy
    Approach: Two pointer
    Time Complexity: O(n)
    Space Complexity: O(1)
*/
package TwoPointer;
class MoveZeroes {
    public static void moveZeroes(int[] nums) {
        int lp = -1;
        for(int rp = 0 ; rp < nums.length ; rp++){
            if(nums[rp]!=0){
                int temp = nums[rp];
                nums[rp] = nums[lp+1];
                nums[lp+1] = temp;
                lp++;
            }
        }

}


    public static void main(String[] args) {
        int[] nums = {0,1,0,3,12};

        moveZeroes(nums);

        for(int num : nums){
            System.out.print(num + " ");
        }
    }
}
