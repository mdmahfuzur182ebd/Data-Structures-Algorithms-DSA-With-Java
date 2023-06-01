package Array;

import java.util.Arrays;
import java.util.Scanner;

public class MultiDimension {
    public static void main(String[] args) {
        /*
          1 2 3
          4 5 6
          7 8 9
        */
        //2d array
        int[][] arr = new int[2][];  //column not necessary
        int[][] arr1 = {
                {1,2,3}, // 0th index
                {4,5},  //1st index
                {6,7,8,9}  //2nd index->> arr1[2]={6,7,8,9}
        };

        int[][] arr4 = new int[3][3];
        System.out.println(arr4.length); // no of rows
        //input
        Scanner in = new Scanner(System.in);
        for (int row = 0; row <arr4.length ; row++) {
           //for each col in every row
            for (int col = 0; col<arr4[row].length; col++){
               arr4[row][col] =  in.nextInt();
            }
        }

        //output
        for (int row = 0; row <arr4.length ; row++) {
            //for each col in every row
            for (int col = 0; col<arr4[row].length; col++){
                System.out.print(arr4[row][col] + " ");
            }
            System.out.println();
        }
         //out for Each ..
        for (int[] ints : arr4) {
            //for each col in every row
            for (int anInt : ints) {
                System.out.print(anInt + " ");
            }
            System.out.println();
        }

        //output
        for (int row = 0; row<arr4.length; row++){
            System.out.println(Arrays.toString(arr4[row]));
        }

        // output in for each used
        for (int[] a : arr4){
            System.out.println(Arrays.toString(a));
        }


        int[][] arr2 = new int[2][3];
        int[][] arr3 = { {33,4545,56,677,22}, {1,2,3,4,5}};
       // System.out.println(Arrays.toString(arr3));
        //System.out.println(arr3[1][1]);



    }
}
