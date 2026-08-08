/*
    Problem: Merge Two Sorted Arrays without any extra space
    Platform: GeeksForGeeks
    Level: Medium
    Approach: Two Pointer
    Time Complexity: O(m*n)
    Space Complexity: O(1)
*/
package TwoPointer;
import java.util.*;

public class MergeArray {
    
    public static void Merge(int[] arr1 , int[] arr2){
        int m = arr1.length;
        int i = m-1;
        int j = 0;
        while(arr1[i] > arr2[j]){
            int temp = arr1[i];
            arr1[i] = arr2[j];
            arr2[j] = temp;
            i--;
            j++;
        }
        Arrays.sort(arr1);
        Arrays.sort(arr2);
    }
    public static void main(String args[]){
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
