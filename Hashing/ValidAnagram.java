/*
    Problem: Valid Anagram
    Platform: LeetCode 242
    Level: Easy
    Approach: Frequency Array
    Time Complexity: O(n)
    Space Complexity: O(1)
*/
package Hashing;
public class ValidAnagram{
    public static boolean Valid(String s, String t){
        if(s.length() != t.length()){
            return false;
        }
        int[] arr = new int[26];
        for(int i = 0 ; i < s.length() ; i++){
            arr[s.charAt(i) - 'a']++;
            arr[t.charAt(i) - 'a']--;
        }
        for(int i = 0 ; i < 26 ; i++){
            if(arr[i] != 0){
                return false;
            }
        }
        return true;
    }

    public static void main(String args[]){
        String s = "anagram";
        String t = "nagaram";
        System.out.println(Valid(s,t));
    }
}