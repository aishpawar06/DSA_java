/*
    Problem: Group Anagrams
    Platform: LeetCode 49
    Level: Medium
    Approach: HashMap + Sorting
    Time Complexity: O(n × k log k)
    Space Complexity: O(n × k)
*/

package Hashing;
import java.util.*;
public class GroupAnagrams {
    public static List<List<String>> groupAnagrams(String[] strs){
        HashMap<String , List<String>> map = new HashMap<>();
        for(int i = 0 ; i < strs.length ; i++){
            char[] tempArray = strs[i].toCharArray();
            Arrays.sort(tempArray);
            String key = new String(tempArray);
            if(map.containsKey(key)){
                map.get(key).add(strs[i]);
            }else{
                List<String> a = new ArrayList<>();
                a.add(strs[i]);
                map.put(key , a);
            }
        }
        return new ArrayList<>(map.values());
    }
    public static void main(String[] args) {

    String[] strs = {"eat", "tea", "tan", "ate", "nat", "bat"};

    List<List<String>> result = groupAnagrams(strs);

    System.out.println(result);
}
}
