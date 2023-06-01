package FunctionJava;

import java.util.Arrays;

public class Overloading {
    //method overloading
    public static void main(String[] args) {
      show();
      show(12,34,55,23,22);
    }

    static void show(int a){
        System.out.println("1");
    }

    static void  show(){
        System.out.println("2");
    }

    static void   show(int ...v){
        System.out.println("3");
        System.out.println(Arrays.toString(v));
    }
}
