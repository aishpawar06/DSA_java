/*
    Problem: Plus One
    Platform: LeetCode 66
    Level: Easy
    Approach: Traverse from end, handle carry by turning 9s into 0s
    Time Complexity: O(n)
    Space Complexity: O(1)
*/
package Arrays;
public class PlusOne{
    public static int[] plusOne(int[] digits) {
        for(int i = digits.length-1 ; i>=0 ; i--){
            if(digits[i] != 9){
                digits[i]++;
                return digits;
            }else{
                digits[i] = 0;
            }
        }
        digits = new int[digits.length+1];
        digits[0] = 1;
        return digits;
    }

    public static void main(String[] args) {
    int[] digits = {9,9,9,9};

    int[] result = plusOne(digits);

    for(int num : result){
        System.out.print(num + " ");
    }
}
}