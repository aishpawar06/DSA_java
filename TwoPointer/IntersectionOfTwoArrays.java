/*
    Problem: Intersection of Two Arrays
    Platform: LeetCode 349
    Level: Easy
    Approach: Two pointer
    Time Complexity: O(n log n + m log m)
    Space Complexity: O(min(n, m))
*/

package TwoPointer;
import java.util.*;
public class IntersectionOfTwoArrays {
    public static int[] intersection(int[] nums1, int[] nums2){
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        List<Integer> lst = new ArrayList<>();
        int i = 0 , j = 0;
        while(i < nums1.length && j < nums2.length){
            if(nums1[i] < nums2[j]){
                i++;
            }
            else if(nums1[i] > nums2[j]){
                j++;
            }
            else{
                if(lst.isEmpty() || lst.get(lst.size()-1) != nums1[i]){
                    lst.add(nums1[i]);
                }
                i++;
                j++;
            }
        }
        int[] intersectionList = new int[lst.size()];
        for(int k = 0 ; k < lst.size() ; k++){
            intersectionList[k] = lst.get(k);
        }
        return intersectionList;
    }

    public static void main(String[] args){
        int[] nums1 = {4,9,5};
        int[] nums2 = {9,4,9,8,4};
        int[] result = intersection(nums1, nums2);
        for(int i = 0 ; i < result.length ; i++){
            System.out.print(result[i] + " ");
        }
    }
    
}
