package Conditionals;

import java.util.Scanner;
//Fibonacci number --Find the nth fibonacci number.
public class FibNumber {
    public static void main(String[] args) {
     Scanner in = new Scanner(System.in);
     int n = in.nextInt();
     int a = 0;
     int b = 1;
     int count = 2;
     while (count <=n){
         int temp = b;
         b = a+b;
         a = temp;
         count++;
     }
        System.out.println(b);
    }
}


/*        Scanner in = new Scanner(System.in);
        int a = 0;
        int b = 1;
        int c;
        for (int i = 1; i<=7; i++){
            c = a+b;
            System.out.println(c);
            a=b;
            b=c;
        }*/

