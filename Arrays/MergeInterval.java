/*
    Problem: Merge Intervals
    Platform: LeetCode 56
    Level: Medium
    Approach: Sorting + Interval Merging
    Time Complexity: O(n log n)
    Space Complexity: O(n) for output
*/

package Arrays;
import java.util.*;
public class MergeInterval {
    public static int[][] merge(int[][] intervals){
        Arrays.sort(intervals , (a,b) -> Integer.compare(a[0],b[0]));
        List<int[]> res = new ArrayList<>();
        int stl=intervals[0][0];
        int endl=intervals[0][1];
        for(int i = 1 ; i < intervals.length ; i++){
            int stc=intervals[i][0];
            int endc = intervals[i][1];
            if(stc <= endl){
                endl=Math.max(endc,endl);
            }else{
                res.add(new int[]{stl,endl});
                endl = endc;
                stl = stc;
            }
        }
        res.add(new int[]{stl,endl});
        return res.toArray(new int[res.size()][]);
    }
    public static void main(String[] args) {
    int[][] intervals = {
        {1, 3},
        {2, 6},
        {8, 10},
        {15, 18}
    };

    int[][] result = merge(intervals);
    for (int[] interval : result) {
        System.out.println(Arrays.toString(interval));
    }
}
}
