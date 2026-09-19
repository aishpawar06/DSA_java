/*
    Problem: Capacity To Ship Packages Within D Days
    Platform: LeetCode 1011
    Level: Medium
    Approach: Binary Search on Answer
    Time Complexity: O(n log(sum(weights)))
    Space Complexity: O(1)
*/

package BinarySearch;
public class LeastCapacity{
    public static boolean isPossible(int[] arr, int capacityPerDay, int totalDays){
        int day = 1;
        int sum = 0;
        for(int i = 0 ; i < arr.length ; i++){
            if(sum+arr[i] <= capacityPerDay){
                sum+=arr[i];
            }else{
                day++;
                sum=arr[i];
            }
        }
        if(day <= totalDays){
            return true;
        }else{
            return false;
        }
    }
    public static int leastCapacity(int[] arr, int day){
        int high = 0;
        int low = 0;
        for(int i = 0 ; i < arr.length ; i++){
            high+=arr[i];
            low = Integer.max(arr[i],low);
        }
        while(low<high){
            int mid = low + (high - low)/2;
            if(isPossible(arr, mid, day)   ){
                high = mid;
            }else{
                low = mid+1;
            }
        }
        return low;
    }
    public static void main(String[] args){
        int[] weights = {1,2,3,1,1};
        System.out.println(leastCapacity(weights, 4));
    }
}