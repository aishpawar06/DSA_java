/*
    Problem: Max Consecutive Ones
    Platform: LeetCode 485
    Level: Easy
    Approach: Traverse array and count consecutive 1s, reset count on 0
    Time Complexity: O(n)
    Space Complexity: O(1)
*/

package Arrays;
class MaxConsecutiveOnes{
    public static int findMaxConsecutiveOnes(int[] nums) {
        int maxCount = 0;
        int count = 0;
        for(int i = 0 ; i < nums.length ; i++){
            if(nums[i] == 0){
                count = 0;
            }else{
                count++;
            }
            maxCount = Math.max(count,maxCount);
        }
        return maxCount;
    }

    public static void main(String[] args){
        int[] arr = {1,1,0,1,1,1};
        System.out.println("Max consecutive 1's : " + findMaxConsecutiveOnes(arr));
    }

}