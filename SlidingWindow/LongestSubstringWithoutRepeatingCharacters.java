/*
    Problem: Longest Substring Without Repeating Characters
    Platform: LeetCode 3
    Level: Medium
    Approach: Sliding Window + HashMap
    Time Complexity: O(n)
    Space Complexity: O(min(n, charset))
*/


package SlidingWindow;
import java.util.*;
public class LongestSubstringWithoutRepeatingCharacters{
    public static int lengthOfLongestSubstring(String s){
        HashMap<Character,Integer> map = new HashMap<>();
        int lptr = 0; 
        int max = 0;
        for(int rptr = 0 ; rptr < s.length() ; rptr++){
            char ch = s.charAt(rptr);
            if(map.containsKey(ch)){
                while(map.containsKey(ch)){
                    map.remove(s.charAt(lptr));
                    lptr++;
                }
            }
            map.put(ch,rptr);
            max = Math.max(max,map.size());
        }
        return max;
    }

    public static void main(String args[]){
        String s = "pwwkew";
        System.out.println(lengthOfLongestSubstring(s));
    }
}