/*
    Problem: Pascal's Triangle II
    Platform: LeetCode 119
    Level: Easy
    Approach: Binomial Coefficient
    Time Complexity: O(n)
    Space Complexity: O(n)
*/

package Math;

import java.util.ArrayList;
import java.util.List;

public class PascalsTriangle_II {
    public static List<Integer> getRow(int rowIndex){
        rowIndex++;
        List<Integer> lst = new ArrayList<>();
        long ans = 1;
        lst.add((int)ans);
        for(int col = 1 ; col < rowIndex ; col++){
            ans*=(rowIndex - col);
            ans/=col;
            lst.add((int)ans);
        }
        return lst;
    }
    public static void main(String[] args) {
        int rowIndex = 5;

        List<Integer> result = getRow(rowIndex);

        System.out.println(result);
    }
}
