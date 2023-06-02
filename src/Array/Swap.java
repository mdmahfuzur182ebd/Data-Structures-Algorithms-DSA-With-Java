package Array;

import java.util.Arrays;

public class Swap {
    public static void main(String[] args) {
        int[] arr = {12,3,4,5,56};
       // swap(arr, 0,3);
        ReversingArray(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void swap(int[] arr, int index1, int index2){
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }

    //reversing an array
    static void ReversingArray(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while (start < end) {
            //swap
            swap(arr, start, end);
            start++;
            end--;
        }
    }
}
