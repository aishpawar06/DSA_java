/*
    Problem: Rotate Image
    Platform: LeetCode 48
    Level: Medium
    Approach: Matrix Transposition + Row Reversal
    Time Complexity: O(n²)
    Space Complexity: O(1)
*/

package Matrix;

public class RotateMatrixBy90 {
    public static void reverse(int row , int[][] matrix ){
        int st = 0;
        int end = matrix[0].length-1;
        while(st<end){
            int temp = matrix[row][st];
            matrix[row][st] = matrix[row][end];
            matrix[row][end] = temp;
            st++;
            end--;
        }
    }
    public static void rotate(int[][] matrix){
        // Transpose
        for(int i = 0 ; i < matrix.length ; i++){
            for(int j = i+1 ; j< matrix[0].length ; j++){
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
        //reverse
        for(int i = 0 ; i < matrix.length ; i++){
            reverse(i,matrix);
        }
    }

    public static void main(String[] args){
        int[][] matrix = {
            {1,2,3},
            {4,5,6},
            {7,8,9}
        };
        rotate(matrix);
        for(int i = 0 ; i < matrix.length ; i++ ){
            for(int j = 0 ; j < matrix[0].length ; j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
    
}
