/*
    Problem: Merge Two Sorted Arrays without any extra space
    Platform: GeeksForGeeks
    Level: Medium
    Approach: gap Methodm / Shell Sort
    Time Complexity: O(m+nlog(m+n))
    Space Complexity: O(1)
*/

package TwoPointer;

public class MergeArray2 {
    public static void swap(int[] arr1, int[] arr2, int i , int j){
        if(arr1[i] > arr2[j]){
            int temp = arr1[i];
            arr1[i] = arr2[j];
            arr2[j] = temp;
        }
    }
    public static void Merge(int[] arr1 , int[] arr2){
        int len = arr1.length+arr2.length;
        int gap = (len/2)+(len%2);
        
        while(gap>0){
            int i = 0;
            int j = i+gap;
            while(j<len){
                if(i<arr1.length && j>=arr1.length){
                    swap(arr1,arr2,i,j-arr1.length);
                }else if(i>=arr1.length){
                    swap(arr2,arr2,i-arr1.length,j-arr1.length);
                }else{
                    swap(arr1,arr1,i,j);
                }
                i++;j++;
            }if(gap==1)break;
            gap = (gap/2)+(gap%2);
        }
    }
    public static void main(String args[] ){
        int[] arr1 = {1,3,5,7};
        int[] arr2 = {0,2,6,8,9};
        Merge(arr1, arr2);
        for(int i = 0 ; i < arr1.length ; i++){
            System.out.print(arr1[i] + " ");
        }
        System.out.println();
        for(int i = 0 ; i < arr2.length ; i++){
            System.out.print(arr2[i] + " ");
        }
        System.out.println();
    }
}
