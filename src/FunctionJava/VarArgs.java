package FunctionJava;

import java.util.Arrays;

public class VarArgs {
    public static void main(String[] args) {
        //fun(3,3,4,2,3,4);
        fun();
        multiple(3,54,"sajib", "some", "take");
    }

    static void demo (int ...v){

    }
    static void  demo(String ...s){

    }

    static void multiple(int a, int b, String ...v) {
        System.out.println(Arrays.toString(v));
    }
    //variable Arguments (varargs)
    //variable length args
     static void fun(int ...a){ //int of array
         System.out.println(Arrays.toString(a));
     }
}
