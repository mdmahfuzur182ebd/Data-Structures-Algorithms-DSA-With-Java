package Conditionals;

import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {
        //Q: Print numbers from 1 to 5
//        for (int i = 1; i<=5; i++){
//            System.out.println(i);
//        }

        /* Syntax of for loops:
        for(initialisation; condition; increment/decrement){
           //body
        }
        */

        // print nu,bers from 1 to n
 /*       Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        for (int i=1; i<=num; i++){
            System.out.print(i+" ");
        }*/

        //while loop
        /* syntax:
          while(condition){
          //   body
         }
       */
//
//        int number = 6;
//        while (number!= 10){
//            System.out.println(number);
//            number++;
//        }
      //do while
        /* do{
             //body
             }while(condition);
        */
//        int num = 1;
//        do {
//            System.out.println(num);
//            num++;
//        }while (num<=5);
//
        int num = 1;
        do {
            System.out.println("Do one ");
            break;
        }while (num!= 1);

    }
}
