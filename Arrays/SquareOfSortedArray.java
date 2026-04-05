/*
    Problem: Squares of a Sorted Array
    Platform: LeetCode 977
    Level: Easy
    Approach: Two pointers - compare absolute values from both ends
    Time Complexity: O(n)
    Space Complexity: O(n)
*/
package Arrays;
class SquareOfSortedArray{

    public static int[] sortedSquares(int[] nums) {
        int n = nums.length;
        int[] result = new int[n];

        int left = 0, right = n - 1;
        int pos = n - 1;

        while(left <= right){
            if(Math.abs(nums[left]) > Math.abs(nums[right])){
                result[pos] = nums[left] * nums[left];
                left++;
            } else {
                result[pos] = nums[right] * nums[right];
                right--;
            }
            pos--;
        }

        return result;
    }

    public static void main(String[] args) {
        int[] nums = {-4,-1,0,3,10};

        int[] res = sortedSquares(nums);

        for(int i : res){
            System.out.print(i + " ");
        }
    }
}