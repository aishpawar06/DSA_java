/*
    Problem: Right Rotate Array by k elements
    Platform: LeetCode 189
    Level: Medium
    Approach: Reverse parts of array to achieve rotation
    Time Complexity: O(n)
    Space Complexity: O(1)
*/

package Arrays;
class RotateArrayRight {
    public static void reverse( int[] arr ,int st, int end){
        while(st < end){
            int temp = arr[st];
            arr[st] = arr[end];
            arr[end] = temp;
            st++;
            end--;
        }
    }
    public static void rotate(int[] nums, int k) {
        if(nums.length == 0) return;
        k=k%nums.length;
        reverse(nums, nums.length-k , nums.length-1);
        reverse(nums,0, nums.length-k-1);
        reverse(nums, 0,nums.length-1);
    }

    public static void main(String[] args){
        int arr[] = {1,2,3,4,5,6,7};
        rotate(arr,3);

        for(int i = 0 ; i < arr.length ; i++){
            System.out.print(" " + arr[i]);
        }
    }
}