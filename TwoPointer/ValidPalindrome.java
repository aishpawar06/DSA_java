/*
    Problem: Valid Palindrome
    Platform: LeetCode 125
    Level: Easy
    Approach: Two Pointers
    Time Complexity: O(n)
    Space Complexity: O(n)
*/

package TwoPointer;
public class ValidPalindrome {
    public static boolean isPalindrome(String s) {
        s = s.toLowerCase();
        s = s.replaceAll("[^a-z0-9]","");
        int n = s.length();
        for(int i = 0 ; i <= n/2 ; i++){
            if(s.charAt(i) != s.charAt(n-i-1)){
                return false;
            }
        }
        return true;
    }
    
    public static void main(String[] args){
        String s = "A man, a plan, a canal: Panama";
        System.out.println(isPalindrome(s));
    }

}