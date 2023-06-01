package Array;

import java.util.Arrays;
import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr = new int[5];
        arr[0] = 23;
        arr[1] = 45;
        arr[2] = 322;
        arr[3] = 233;
        //[23,45,322,233]
        System.out.println(arr[3]); //233

        //input using for loops
//        for (int i = 0; i<arr.length; i++){
//            arr[i] = in.nextInt();
//        }

        //System.out.println(Arrays.toString(arr));

//        for (int i = 0; i < arr.length; i++) {
//            System.out.print(arr[i] + " ");
//
//        }

//        for (int num : arr){ //for every element in array, print the element
//            System.out.print(num +" ");  // here num represents element of the array
//        }
        //System.out.println(arr[5]); // index out of bound error

        //Array of objects
        String[] str = new String[4];
        for (int i = 0; i < str.length; i++) {
            str[i] = in.next();
        }
        // modify
        str[1] ="same";
        System.out.println(Arrays.toString(str));
    }
}
