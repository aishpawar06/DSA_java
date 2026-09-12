package Hashing;
import java.util.*;
public class TopKFreqElements {
    public static int[] freqElements(int[] nums , int k){
        HashMap<Integer , Integer> map = new HashMap<>();
        for(int i = 0 ; i < nums.length ; i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        List<Integer> lst = new ArrayList<>();
        while(k>0){
            int maxKey = Collections.max(map.entrySet(), Map.Entry.comparingByValue()).getKey();
            lst.add(maxKey);
            map.remove(maxKey);
            k--;
        }
        return lst.stream().mapToInt(Integer::intValue).toArray();
    }
    public static void main(String[] args){
        int[] nums = {1,1,1,2,2,3};
        int k = 2;
        int[] ans = freqElements(nums, k);
        System.out.print("[ ");
        for(int i = 0 ; i < ans.length ; i++){
            System.out.print(ans[i] + " ");
        }
        System.out.print("]");

    }
}
