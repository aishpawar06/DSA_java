/*
    Problem: Find the Smallest Divisor Given a Threshold
    Platform: LeetCode 1283
    Level: Medium
    Approach: Binary Search on Answer
    Time Complexity: O(n log(max(nums)))
    Space Complexity: O(1)
*/
package BinarySearch;
public class SmallestDivisor {
    public static boolean canBeDivided(int[] nums, int d, int threshold){
        long sum=0;
        for(int i = 0 ; i < nums.length ; i++){
            sum+=Math.ceil((double)nums[i]/d);
        }
        if(sum <= threshold){
            return true;
        }else{
            return false;
        }
    }
    public static int smallestDivisor(int[] nums,int threshold) {
        int high = Integer.MIN_VALUE;
        for(int i = 0 ; i < nums.length ; i++){
            high = Math.max(nums[i],high);
        }
        int low = 1;
        while(low < high){
            int mid = low+(high-low)/2;
            if(canBeDivided(nums,mid,threshold)){
                high = mid;
            }else{
                low = mid+1;
            }
        }
        return low;
    }
    public static void main(String[] args) {
        int[] nums = {44,22,33,11,1};
        int threshold = 5;

        int result = smallestDivisor(nums, threshold);

        System.out.println(result);
    }
}