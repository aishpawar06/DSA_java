/*
    Problem: Find All Anagrams in a String
    Platform: LeetCode 438
    Level: Medium
    Approach: Sliding Window + HashMap
    Time Complexity: O(n)
    Space Complexity: O(1)
*/
package SlidingWindow;
import java.util.*;
public class FindAllAnagramsInAString {
    public static List<Integer> findAnagrams(String s, String p){
        List<Integer> result = new ArrayList<>();
        if(s.length() < p.length()) return result;
        HashMap<Character,Integer> map1 = new HashMap<>();
        for(int i = 0; i < p.length() ; i++){
            map1.put(p.charAt(i) , map1.getOrDefault(p.charAt(i),0)+1);
        }
        int lp = 0 ;
        int rp = p.length()-1;

        HashMap<Character, Integer> map2 = new HashMap<>();
        for(int i = lp ; i <= rp ; i++){
            map2.put(s.charAt(i), map2.getOrDefault(s.charAt(i),0)+1);
        }

        if(map1.equals(map2)) result.add(lp);

        while(rp<s.length()-1){
            char leftChar = s.charAt(lp);
            map2.put(leftChar,map2.get(leftChar)-1);
            if(map2.get(leftChar)==0){
                map2.remove(leftChar);
            }

            lp++;
            rp++;

            char rightChar = s.charAt(rp);
            map2.put(rightChar,map2.getOrDefault(rightChar,0)+1);
            if(map1.equals(map2)){
                result.add(lp);
            }
        }
        return result;

    }

    public static void main(String[] args){
        String s = "cbaebabacd";
        String p = "abc";
        System.out.println(findAnagrams(s, p));
    }
    
}
