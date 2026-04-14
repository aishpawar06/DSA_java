/*
    Problem: Duplicate Zeros
    Platform: LeetCode 1089
    Level: Easy
    Approach: Traverse array and shift elements right whenever zero is found
    Time Complexity: O(n^2)
    Space Complexity: O(1)
*/
package Arrays;
class DuplicateZeros {

    public static void duplicateZeros(int[] arr) {
        int n = arr.length;

        for(int i = 0; i < n; i++){
            if(arr[i] == 0){
                for(int j = n - 1; j > i; j--){
                    arr[j] = arr[j - 1];
                }
                if(i + 1 < n){
                    arr[i + 1] = 0;
                }
                i++;
            }
        }
    }
    public static void main(String[] args) {
        int[] arr = {1,0,2,3,0,4,5,0};

        duplicateZeros(arr);

        for(int num : arr){
            System.out.print(num + " ");
        }
    }
}