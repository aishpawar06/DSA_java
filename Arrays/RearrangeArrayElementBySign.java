/*
    Problem: Rearrange Array Elements By Sign
    Platform: LeetCode 2149
    Level: Medium
    Approach: Auxiliary Array with Even/Odd Index Placement
    Time Complexity: O(n)
    Space Complexity: O(n)
*/

package Arrays;

public class RearrangeArrayElementBySign {
    public static int[] rearrangeArray(int[] nums){
        int pos = 0;
        int neg = 1;
        int[] result = new int[nums.length];
        for(int i = 0 ; i < nums.length ; i++){
            if(nums[i] < 0){
                result[neg] = nums[i];
                neg+=2;
            }else{
                result[pos] = nums[i];
                pos+=2;
            }
        }
        return result;
    }
    
    public static void main(String args[]){
        int[] arr = {3,1,-2,-5,2,-4};
        int[] result = rearrangeArray(arr);
        for(int i = 0 ; i < result.length ; i++){
            System.out.print(result[i] + " ");
        }
    }
}
