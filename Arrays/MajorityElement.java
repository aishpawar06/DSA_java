/*
    Problem: Majority Element
    Platform: LeetCode
    Level: Easy
    Approach: Sort the array and count consecutive occurrences
    Time Complexity: O(n log n)
    Space Complexity: O(1)
*/
package Arrays;
import java.util.Arrays;

public class MajorityElement {

    public static int majorityElement(int[] nums) {
        Arrays.sort(nums);

        int count = 1;

        for(int i = 1; i < nums.length; i++) {

            if(nums[i] == nums[i - 1]) {
                count++;

                if(count > nums.length / 2) {
                    return nums[i];
                }
            }
            else {
                count = 1;
            }
        }

        return nums[0];
    }

    public static void main(String[] args) {

        int[] nums = {2, 2, 1, 1, 1, 2, 2};

        int result = majorityElement(nums);

        System.out.println("Majority Element: " + result);
    }
}