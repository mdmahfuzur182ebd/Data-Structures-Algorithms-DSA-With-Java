package com.Mahfuzur;

import java.util.Scanner;

public class TypeCasting {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
     /*   float num = input.nextFloat();
        System.out.println(num);*/

        //type casting
        int n = (int)45.5f;
        System.out.println(n);

        //automatic type promotion in expressions
//        int a = 259;
//        byte b =(byte) a; //257% 256 =1
//        System.out.println(b);

//        byte a = 40;
//        byte b = 50;
//        byte c = 100;
//        int d = a*b/c;  // byte convert int
//        System.out.println(d);
      // byte b = 50;
      // b = b*3; error
      // b = (byte) (b*3);
//        int number = 'A';
//        System.out.println(number);
     //   System.out.println(4*4.3);

        byte b = 42;
        char c = 'a';
        short s = 1933;
        int i = 4444;
        float f = 44.4f;
        double d = 03.3333;
        double result = (f*b) + (i / c) - (d*s);
        // float + int - double = double
        System.out.println((f*b) + " " +(i / c) + " " +(d*s));
        System.out.println(result);

    }
}
