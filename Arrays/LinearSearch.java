/*
    Problem : Linear Search
    Platform : BAsic DSA/ Self Practice
    level : Easy
    Approach : Traverse the array one by one and compare each element
    TC : O(N)
    SC : O(1)
 */


package Arrays;
public class LinearSearch{
    public static int search(int[] arr, int key){
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == key){
                return i;
            }
        }
        return -1;

    }
    public static void main(String[] args){
        int[] array = {1,2,4,5,6,3,9,10};
        int key = 9;
        System.out.println("Element found at index : " + search(array, key));

    }
}