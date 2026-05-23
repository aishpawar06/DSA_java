/*
    Problem: Longest Common Prefix
    Platform: LeetCode 14
    Level: Easy
    Approach: Horizontal Scanning
    Time Complexity: O(n × m)
    Space Complexity: O(1)
*/

package Arrays;

public class LongestCommonPrefix {
    public static String longestPrefix(String[] strs){
        StringBuilder sb = new StringBuilder("");
        for(int i = 0 ; i < strs[0].length() ; i++){
            for(int j = 1 ; j < strs.length ; j++){
                if(i >= strs[j].length()){
                    return sb.toString();
                }
                if(strs[j].charAt(i) != strs[0].charAt(i)){
                    return sb.toString();
                }

            }
            sb.append(strs[0].charAt(i));
        }
        return sb.toString();
    }
    public static void main(String[] args){
        String[] strs = {"flower", "flow", "flight"};
        System.out.println(longestPrefix(strs));
    }
}
