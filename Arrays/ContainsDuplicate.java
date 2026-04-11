/*
    Problem: Contains Duplicate
    Platform: LeetCode 217
    Level: Easy
    Approach: Use HashSet to track seen elements; if element already exists → duplicate found
    Time Complexity: O(n)
    Space Complexity: O(n)
*/
package Arrays;
import java.util.*;

public class ContainsDuplicate {

    public static boolean containsDuplicate(int[] nums) {
        HashSet<Integer> set = new HashSet<>();

        for(int num : nums){
            if(!set.add(num)) {
                return true;
            }
        }

        return false;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 1};

        boolean result = containsDuplicate(nums);

        if(result){
            System.out.println("Duplicate exists");
        } else {
            System.out.println("No duplicates");
        }
    }
}