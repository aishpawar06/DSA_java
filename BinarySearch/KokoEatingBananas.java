/*
    Problem: Koko Eating Bananas
    Platform: LeetCode 875
    Level: Medium
    Approach: Binary Search on Answer
    Time Complexity: O(n log(max(piles)))
    Space Complexity: O(1)
*/

package BinarySearch;
public class KokoEatingBananas{
    public static int totalHours(int[] arr , int bananasPerHour){
        int totalHours = 0;
        for(int i = 0 ; i < arr.length ; i++){
            totalHours += (int)Math.ceil((double)arr[i]/bananasPerHour);
        }
        return totalHours;
    }
    public static int minEatingSpeed(int[] piles , int h){
        int low = 1;
        int high = Integer.MIN_VALUE;
        for(int i = 0 ; i < piles.length ; i++){
            high = Math.max(high , piles[i]);
        }
        while(low<high){
            int mid = low + (high - low)/2;
            int totalhrs = totalHours(piles, mid);
            if(totalhrs > h){
                low = mid+1;
            }else{
                high = mid;
            }
        }
        return low;
    }
    public static void main(String[] args) {
        int[] piles = {3, 6, 7, 11};
        int h = 8;

        int result = minEatingSpeed(piles, h);

        System.out.println(result);
    }
}