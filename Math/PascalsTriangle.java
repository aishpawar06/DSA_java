/*
    Problem: Pascal's Triangle
    Platform: LeetCode 118
    Level: Easy
    Approach: Binomial Coefficient / Combinatorial Formula
    Time Complexity: O(n²)
    Space Complexity: O(n²)
*/

package Math;
import java.util.*;
public class PascalsTriangle {
    public static List<Integer> generateRow(int row){
        List<Integer> lst = new ArrayList<>();
        int sum = 1;
        lst.add(sum);
        for(int col = 1 ; col < row ; col++){
            sum *= (row - col);
            sum /= col;
            lst.add(sum);
        }
        return lst;
    }
    public static List<List<Integer>> generate(int rowNum){
        List<List<Integer>> lst = new ArrayList<>();
        for(int row = 1 ; row <= rowNum ; row++){
            lst.add(generateRow(row));
        }
        return lst;
    }
    public static void main(String args[]){
        List<List<Integer>> lst = new ArrayList<>();
        lst = generate(6);
        for(int i = 0 ; i < lst.size() ; i++){
            for(int j = 0 ; j < lst.get(i).size() ; j++){
                System.out.print(lst.get(i).get(j) + " ");
            }
            System.out.println();
        }
    }
    
}
