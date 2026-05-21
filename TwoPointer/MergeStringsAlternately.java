/*
    Problem: Merge Strings Alternately
    Platform: LeetCode 1768
    Level: Easy
    Approach: Two Pointers
    Time Complexity: O(n + m)
    Space Complexity: O(n + m)
*/

package TwoPointer;
import java.util.*;
public class MergeStringsAlternately {
    public static String mergeAlternately(String word1, String word2) {
        int small = Math.min(word1.length(),word2.length());
        int big = Math.max(word1.length(),word2.length());
        StringBuilder sb = new StringBuilder("");
        int i = 0 ;
        for(i = 0 ; i < small ; i++ ){
           sb.append(word1.charAt(i));
           sb.append(word2.charAt(i));
        }

        if(i<word1.length()){
            for(; i< big ; i++){
                sb.append(word1.charAt(i));
            }
        }else{
            for(; i< big ; i++){
                sb.append(word2.charAt(i));
            }
        }
        return sb.toString();
    }
        public static void main(String[] args) {

        String word1 = "abcdef";
        String word2 = "pqrstu";

        String result = mergeAlternately(word1, word2);

        System.out.println("Merged String: " + result);
        }
}
