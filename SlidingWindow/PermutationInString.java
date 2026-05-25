/*
    Problem: Permutation in String
    Platform: LeetCode 567
    Level: Medium
    Approach: Sliding Window + HashMap
    Time Complexity: O(n)
    Space Complexity: O(1)
*/

package SlidingWindow;
import java.util.*;
public class PermutationInString {
    public static boolean checkInclusion(String s1, String s2) {
        if(s1.length() > s2.length()) return false;
        HashMap<Character , Integer> map1 = new HashMap<>();
        for(int i = 0 ; i < s1.length() ; i++){
            map1.put(s1.charAt(i), map1.getOrDefault(s1.charAt(i),0)+1);
        }

        int lp = 0;
        int rp = s1.length() - 1;
        HashMap<Character,Integer> map2 = new HashMap<>();
        for(int i = lp ; i <= rp ; i++){
            map2.put(s2.charAt(i) , map2.getOrDefault(s2.charAt(i) , 0)+1);
        }

        if(map1.equals(map2)) return true;
        while(rp<s2.length() - 1){
            char left = s2.charAt(lp);
            map2.put(left,map2.get(left)-1);
            if(map2.get(left) == 0){
                map2.remove(left);
            }

            lp++;
            rp++;
            char right = s2.charAt(rp);
            map2.put(right , map2.getOrDefault(right, 0)+1);
            if(map1.equals(map2)) return true; 
        }

        return false;
    }
    public static void main(String[] args){
        String s1 = "ab";
        String s2 = "eidbaooo";
        System.out.println(checkInclusion(s1,s2));
    }  
}
