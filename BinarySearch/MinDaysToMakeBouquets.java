/*
Problem: Minimum Number of Days to Make m Bouquets
Platform: LeetCode 1482
Level: Medium
Approach: Binary Search on Answer
Time Complexity: O(n log(maxDay - minDay))
Space Complexity: O(1)
*/

package BinarySearch;
public class MinDaysToMakeBouquets{
    public static boolean canFormBouquet(int[] bloomDays , int day , int m , int k){
        int temp = k;
        for(int i = 0 ; i < bloomDays.length ; i++){
            if(bloomDays[i] <= day){
                k--;
                if(k==0){
                    m--;
                    k=temp;
                }
                if(m==0)return true;
            }else{
                k=temp;
            }
        }
        return false;
    }
    public static int minDays(int[] bloomDays , int m , int k){
        if(m*k > bloomDays.length) return -1;
        int low = Integer.MAX_VALUE;
        int high = Integer.MIN_VALUE;
        for(int i = 0 ; i < bloomDays.length ; i++){
            if(bloomDays[i] > high) high = bloomDays[i];
            if(bloomDays[i] < low)  low = bloomDays[i];
        }
        while(low<high){
            int mid = low + (high - low)/2;
            if(canFormBouquet(bloomDays, mid, m, k)) high = mid;
            else low = mid+1;
        }
        return low;

    }
    public static void main(String[] args){
        int[] bloomDays = {7,7,7,7,13,11,12,7};
        System.out.println(minDays(bloomDays, 3,2));
    }
}

