/*
    Problem: Sqrt(x)
    Platform: LeetCode 69
    Level: Easy
    Approach: Binary Search
    Time Complexity: O(log n)
    Space Complexity: O(1)
*/

package BinarySearch;

public class SqrtX {

    public static int mySqrt(int x) {

        long low = 0;
        long high = x;

        while (low < high) {

            // Upper middle to ensure progress when low and high are adjacent
            long mid = low + (high - low + 1) / 2;

            if (mid * mid == x) {
                return (int) mid;
            } 
            else if (mid * mid > x) {
                high = mid - 1;
            } 
            else {
                low = mid;
            }
        }

        return (int) low;
    }

    public static void main(String[] args) {

        int x = 8;

        int result = mySqrt(x);

        System.out.println("Square root of " + x + " = " + result);
    }
}
