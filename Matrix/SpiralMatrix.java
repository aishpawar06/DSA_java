
package Matrix;
import java.util.*;
public class SpiralMatrix {
    public static List<Integer> spiral(int[][] matrix){
        List<Integer> lst = new ArrayList<>();
        int left = 0;
        int right = matrix[0].length - 1;
        int top = 0;
        int bottom = matrix.length - 1;
        while(left <= right && top <= bottom){
            for(int i = left ; i <= right ; i++){
                lst.add(matrix[top][i]);
            }
            top++;
            for(int i = top ; i <= bottom ; i++){
                lst.add(matrix[i][right]);
            }
            right--;
            if(top <= bottom){
                for(int i = right ; i >= left ; i--){
                    lst.add(matrix[bottom][i]);
                }
            }
            bottom--;
            if(left <= right){
                for(int i = bottom ; i >= top ; i--){
                    lst.add(matrix[i][left]);
                }
            }
            left++;
        }
        return lst;
    }
    public static void main(String[] args){
        int[][] matrix = {{1,2,3,4},{12,13,14,5},{11,16,15,6},{10,9,8,7}};
        List<Integer> lst = spiral(matrix);
        for(int i = 0 ; i < lst.size() ; i++){
            System.out.print(lst.get(i) + " ");
        }
    }
    
}
