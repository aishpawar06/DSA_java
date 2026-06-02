/*
    Problem: Longest Repeating Character Replacement
    Platform: LeetCode 424
    Level: Medium
    Approach: Variable Sliding Window + HashMap
    Time Complexity: O(n)
    Space Complexity: O(1)
*/

package SlidingWindow;
import java.util.*;
public class LongestRepeatingCharacterReplacement {
    public static int characterReplacement(String s , int k){
        int lp = 0,rp = 0;
        int ans = 0,max = 0;
        HashMap<Character, Integer> map = new HashMap<>();
        while(rp < s.length()){
            map.put(s.charAt(rp) , map.getOrDefault(s.charAt(rp),0)+1);
            max=0;
            for(Integer value : map.values()){
                max = Math.max(max,value);
            }
            if(((rp-lp)+1)-max > k){
                map.put(s.charAt(lp),map.get(s.charAt(lp))-1);
                if(map.get(s.charAt(lp))==0) map.remove(s.charAt(lp));
                lp++; 
            }
            ans = Math.max(ans,(rp-lp)+1);
            rp++;
        }
        return ans;
    }

    public static void main(String[] args){
        String s = "ABAB";
        int k = 2;
        System.out.println(characterReplacement(s, k));
    }
}
