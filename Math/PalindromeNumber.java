/*
    Problem: Palindrome Number
    Platform: LeetCode 9
    Level: Easy
    Approach: Reverse Half of the Number
              Reverse only half of the digits and compare
              with the remaining half to avoid overflow.
    Time Complexity: O(log n)
    Space Complexity: O(1)
*/

package Math;

public class PalindromeNumber {
    public static boolean isPalindrome(int x) {

        if (x < 0 || (x % 10 == 0 && x != 0)) {
            return false;
        }

        int reversedHalf = 0;

        while (x > reversedHalf) {
            reversedHalf = reversedHalf * 10 + x % 10;
            x /= 10;
        }

        return x == reversedHalf || x == reversedHalf / 10;
    }
    public static void main(String[] args){
        int num = 12121;
        System.out.println(isPalindrome(num));
    }
    
}
