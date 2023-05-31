package ArrayBasic;

import java.util.Scanner;

public class BasicArray {
    public static void main(String[] args) {
        //What is Array?
        //Type of Array?
        // Advantage and DisAdvantage in Array.
        //iteration of array or display array.
        //Declaration and creation  and Initialization
        /* Syntax :
        datatype [] arrayName = new datatype[size]
        */
//        int[] arr = new int[3];
//        arr[0]= 33;
//        arr[1]= 43;
//        arr[2]= 23;
//        System.out.println(arr[0]);

       // int[] arr = new int[] {33,44,44,222,442,55};
      //  int[] arr = {33 ,22 ,33 ,44 ,93,33};
//        for (int i = 0; i <arr.length ; i++) {
//            //System.out.println(i);
//           System.out.print(arr[i] + " ");
//        }
//        for(int i : arr){
//            System.out.print(i + " ");
//        }
//input n and element
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the Array Size");
        int n = in.nextInt();

        int[] array = new int[n];
        System.out.print("Enter the Element");

        for (int i =0; i<array.length; i++){
             array[i] = in.nextInt();
        }

        //print
        for (int i = 0; i<array.length; i++){
            System.out.println(array[i]);
        }


    }
}

