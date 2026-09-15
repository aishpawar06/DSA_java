/*
    Problem: Reverse Integer
    Platform: LeetCode 7
    Level: Medium
    Approach: Digit Extraction + Overflow Handling
    Time Complexity: O(log |x|)
    Space Complexity: O(1)
*/

package Math;
public class ReverseInteger{
    public static int reverse(int x) {
        int result = 0;
        while(x!= 0){
            int digit = x%10;
            x/=10;
            if(result > Integer.MAX_VALUE/10 || result == Integer.MAX_VALUE/10 && digit > 7){
                return 0;
            }
            if(result < Integer.MIN_VALUE/10 || result == Integer.MIN_VALUE/10 && digit < -8){
                return 0;
            }
            result = result * 10 + digit;
        }
        return result;
    }
    public static void main(String[] args) {
        int x = 123;
        int result = reverse(x);
        System.out.println(result);
    }
}