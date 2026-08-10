/*
    Problem: Set Matrix Zeroes
    Platform: LeetCode 73
    Level: Medium
    Approach: Matrix Marking (First Row & First Column as Markers)
    Time Complexity: O(m × n)
    Space Complexity: O(1)
*/

package Matrix;
public class SetMatrixZero{
    public static void setZero(int[][] nums){
        boolean rowZero = false;
        for(int i = 0 ; i < nums.length ; i++){
            for(int j = 0 ; j < nums[0].length ; j++){
                if(nums[i][j] == 0){
                    nums[0][j] = 0;

                    if(i>0){
                        nums[i][0] = 0;
                    }else{
                        rowZero = true;
                    }
                }
            }
        }
        for(int i = 1 ; i < nums.length ; i++){
            for(int j = 1 ; j < nums[0].length ; j++){
                if(nums[0][j] == 0  || nums[i][0]== 0){
                    nums[i][j] = 0;
                }
            }
        }
        if(nums[0][0] == 0){
            for(int i = 0 ; i < nums.length ; i++){
                nums[i][0] = 0;
            }
        }
        if(rowZero){
            for(int j = 0 ; j < nums[0].length ; j++ ){
                nums[0][j] = 0; 
            }
        }
    }
    public static void main(String[] args){
        int[][] nums = {
            {1,2,0},
            {3,4,1},
            {9,6,4}
        };
        setZero(nums);
        for(int i = 0 ; i < nums.length ; i++){
            for(int j = 0 ; j < nums[0].length ; j++){
                System.out.print(nums[i][j] + " ");
            }
            System.out.println();
        }
    }
}