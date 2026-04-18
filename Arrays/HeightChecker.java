/*
    Problem: Height Checker
    Platform: LeetCode 1051
    Level: Easy
    Approach: Copy array, sort it, and count mismatched positions
    Time Complexity: O(n log n)
    Space Complexity: O(n)
*/
package Arrays;
import java.util.*;
class HeightChecker{
    public static int heightChecker(int[] heights) {
        int[] expected = new int[heights.length];
        for(int i = 0 ; i < heights.length ; i++){
            expected[i] = heights[i];
        }
        Arrays.sort(expected);
        int count = 0;
        for(int i = 0 ; i < heights.length ; i++){
            if(heights[i] != expected[i]){
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
    int[] heights = {1,1,4,2,1,3};

    int result = heightChecker(heights);

    System.out.println("Number of mismatches: " + result);
}
}