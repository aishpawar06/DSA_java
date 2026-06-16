/*
    Problem: Merge Strings Alternately
    Platform: LeetCode 1768
    Level: Easy
    Approach: Two Pointers
    Time Complexity: O(n + m)
    Space Complexity: O(n + m)
*/

package TwoPointer;
public class MergeStringsAlternately {
    public static String mergeAlternately(String word1, String word2) {
        StringBuilder sb = new StringBuilder("");
        int idx = 0;
        while(idx < word1.length() && idx < word2.length()){
            sb.append(word1.charAt(idx));
            sb.append(word2.charAt(idx));
            idx++;
        }
        while(idx < word1.length()){
            sb.append(word1.charAt(idx));
            idx++;
        }
        while(idx < word2.length()){
            sb.append(word2.charAt(idx));
            idx++;
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
